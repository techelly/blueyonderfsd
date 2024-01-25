package com.blueyonder.lambdaexample;

import java.sql.SQLOutput;

public class CalculatorMainApp {
    public static void main(String[] args) {
        Calculator add = (n1,n2)-> {
            int result = n1+n2;
            return result;};
        Calculator sub = (n1,n2)-> {
            int result = n1-n2;
            return result;};

        Calculator mul = (n1,n2)-> {
            int result = n1*n2;
            return result;};
        System.out.println(mul);
        System.out.println(add.compute(10,20));
        System.out.println(sub.compute(20,10));
        System.out.println(mul.compute(10,20));
    }
}
