package com.java.streams;

import java.util.List;

public class TakeWhile {

    public static void main(String[] args) {
        
        final List<Integer> data = List.of(1,2,3,4,5,6,7,8,9);

        data.stream().takeWhile(i -> i < 7).forEach(i -> System.out.println(i));

        System.out.println("-----");

        List<Integer> numbers = List.of(1, 2, 10, 20, 3, 4);

        numbers.stream().dropWhile(n -> n < 10).forEach(i -> System.out.println(i));
    }
}