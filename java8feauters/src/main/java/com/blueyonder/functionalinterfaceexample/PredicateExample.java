package com.blueyonder.functionalinterfaceexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(6,4,3,2,11,12);
        List<Integer> filteredList = filterNumbers(listOfInteger, n->n>4);
        System.out.println(filteredList);
    }
    public static List<Integer> filterNumbers(List<Integer> listOfInteger, Predicate<Integer> predicate){
        List<Integer> listOfNum = new ArrayList<Integer>();
        for(Integer n : listOfInteger) {
            if(predicate.test(n)) {
                listOfNum.add(n);
            }
        }
        return listOfNum;
    }
}


