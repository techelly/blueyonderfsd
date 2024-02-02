package com.blueyonder.main;


public class Calculator {

    private Integer num1;
    private Integer num2;

    public Calculator(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public int addition(Integer num1, Integer num2){
        return num1+num2;
    }

    public int subtraction(Integer num1,Integer num2){
        return num1-num2;
    }

    public int multiplication(Integer num1,Integer num2){
        return num1*num2;
    }

    public int division(Integer num1,Integer num2) throws ArithmeticException{
        if(num2>0)

    {
        return num1 / num2;
    }else{
            throw new ArithmeticException("Division by zero not allowed");
    }
    }
}
