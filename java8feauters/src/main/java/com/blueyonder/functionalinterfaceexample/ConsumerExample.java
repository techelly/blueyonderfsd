package com.blueyonder.functionalinterfaceexample;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,10,200,101,-10,0);
        Consumer<Integer> consumer = x-> System.out.println(" "+x);
        printIntegers(listOfInteger,consumer);
    }

    public static void printIntegers(List<Integer> listOfInteger,Consumer<Integer> consumer ){
        for(Integer n : listOfInteger){
            consumer.accept(n);
        }

    }
}
