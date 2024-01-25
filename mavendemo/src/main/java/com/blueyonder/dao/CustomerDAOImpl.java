package com.blueyonder.dao;

import com.blueyonder.exceptions.CustomerNotFoundException;
import com.blueyonder.model.Customer;
import com.blueyonder.util.CustomerResultSetHelper;
import com.blueyonder.util.DBConnectionUtil;
import com.blueyonder.util.QueryMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public Customer addCustomer(Customer customer) {
        Connection conn = DBConnectionUtil.getDBConnection();
        try {
            PreparedStatement pStmt = conn.prepareStatement(QueryMapper.ADD_CUSTOMER);
            pStmt.setInt(1,customer.getCustomerId());
            pStmt.setString(2,customer.getCustomerName());
            pStmt.setDate(3,Date.valueOf(customer.getDateOfBirth()));
            int rows = pStmt.executeUpdate();
            if(rows>0){
                return customer;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Customer getCustomerById(Integer customerId) {
        String URL="jdbc:postgresql://localhost:5432/bydb";
        Customer customer = new Customer();
        try {
            //Getting a connection object or Establish the connection
            //Connection conn = DriverManager.getConnection(URL, "postgres", "password");
            Connection conn = DBConnectionUtil.getDBConnection();
            //PrepareStatement object
            PreparedStatement pStmt= conn.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
            pStmt.setInt(1,customerId);

            ResultSet rs = pStmt.executeQuery();
            while(rs.next()){
                customer.setCustomerId(rs.getInt(1));
                customer.setCustomerName(rs.getString(2));
                customer.setDateOfBirth(rs.getDate(3).toLocalDate());
            }
        }catch(SQLException se){
                se.printStackTrace();
            }


            return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
        //Lookup for customer using customerId -- call getCustomerById(customer.getCustomerId)

        try {
            Connection conn = DBConnectionUtil.getDBConnection();
            //Statement stmt = conn.createStatement();
            //execute statement
            //PrepareStatement object
            PreparedStatement pStmt= conn.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
            pStmt.setInt(1,customer.getCustomerId());
            ResultSet rs = pStmt.executeQuery();
            if(rs.next()){
                if(rs.getInt(1) == customer.getCustomerId()){

                    //UPDATE CUSTOMER SET customername=?,dateofbirth=? where customerid=?;
                    //pstmt.setString(1,)
                    //pstmt.setDate(2,)
                    //pstmt.setInt(3,)
                    //Write logic to update
                }

            }else{
                throw new CustomerNotFoundException();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //if customer exists in DB then using setter and getter update the values
        //Then call addCustomer(customer)
        //else throw exception CustomerNotFoundException
        return null;
    }

    @Override
    public String deleteCustomerById(Integer customerId) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        String URL="jdbc:postgresql://localhost:5432/bydb";
        List<Customer> customerList = new ArrayList<Customer>();
        try {
            //Getting a connection object or Establish the connection
            //Connection conn = DriverManager.getConnection(URL,"postgres","password");
            Connection conn = DBConnectionUtil.getDBConnection();
            //statement object
            //Here we are creating statement object by using the implementation of createStatement from Vendor side
            Statement stmt = conn.createStatement();
            //execute statement
            ResultSet rs = stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
            //handle result

            while (rs.next()) {
                Customer customer = new Customer();
                customer = CustomerResultSetHelper.resultSetToCustomer(customer,rs);
                customerList.add(customer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
