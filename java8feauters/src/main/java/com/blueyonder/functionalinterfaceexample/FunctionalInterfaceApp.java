package com.blueyonder.functionalinterfaceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceApp {

    public static void main(String[] args) {
        Order orderOne = new Order("AUD",15000.00);
        Order orderTwo = new Order("INR",5000.00);
        Order orderThree = new Order("USD",150000.00);
        Order orderFour = new Order("EUR",5000.00);
        Order orderFive = new Order("AUD",8000.00);
        Order orderSix = new Order("EUR",5000.00);
        Order orderSeven = new Order("EUR",1000.00);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);
        orderList.add(orderFour);
        orderList.add(orderFive);
        orderList.add(orderSix);
        orderList.add(orderSeven);


        //Function interface
        Function<List<Order>,Double> averageOrder = orderLists->{
            double total = 0.0;
            for(Order order: orderLists) {
                total+=order.getAmount();//total=total+order.getAmount
            }
            return total/orderList.size();//calculating the average
        };
        System.out.println(averageOrder.apply(orderList));

    }
}
