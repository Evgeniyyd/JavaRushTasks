package com.javarush.task.pro.task18.task1817;

import java.util.stream.Stream;

/* 
Анализ потока чисел
*/

public class Solution {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Any negative even numbers in the stream? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Only positive numbers in the stream? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Only negative numbers in the stream? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        boolean b = stream.anyMatch(integer -> (integer.intValue() < 0 && integer.intValue() % 2 == 0));
        return b;
    }
    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        boolean b = stream.allMatch(integer -> integer.intValue() > 0 );
        return b;
    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        boolean b = stream.noneMatch(streams -> (streams.intValue() > 0));
        return b;
    }
}
