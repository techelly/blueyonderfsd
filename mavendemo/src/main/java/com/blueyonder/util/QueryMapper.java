package com.blueyonder.util;

public interface QueryMapper {

    public static final String GET_CUSTOMER_BY_ID = "select * from customer where customerid=?";
    public static final String GET_ALL_CUSTOMERS= "select * from customer";
    public static final String ADD_CUSTOMER = "INSERT INTO CUSTOMER(customerid,customername,dateofbirth) VALUES(?,?,?)";

    //public static final String UPDATE_CUSTOMER="update customer set customerName=?,birthDate=? where customerId=?";
}
