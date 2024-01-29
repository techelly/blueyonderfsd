package com.blueyonder.streamapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10,20,30,40);
         stream.forEach(System.out::println);

         Integer[] values = new Integer[]{10,40,50};
         Stream<Integer> strm = Arrays.stream(values);
         strm.forEach(System.out::println);

        List<Integer> listOfNumbers = Arrays.asList(15, 11, 10, 9, 12, 13, 2, 5, 8, 1, 7, 6, 4, 14, 16);
        listOfNumbers.stream().filter(n -> n > 9).forEach(System.out::println);
    }
}
