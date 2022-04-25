package com.xpanxion.assignments.groupc;

import java.sql.Array;
import java.util.ArrayList;

public class student13 {
    public static void main(String[] args) {
        ex_1();
        ex_2();
        ex_3();
    }

    //Ex. 1
    private static void ex1() {
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> newList = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0;i < ints.length; i++) {
            newList.add(ints[i]);
            sum = sum + newList.get(i);
        }
        System.out.println("List wrapped in Integer: " + newList);
        System.out.println("Sum of the array: " + sum);

        return 0;
    }

    //Ex. 2
    private static void ex2() {
        avgNumbers(new ArrayList<>());
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> newList = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0;i < ints.length; i++) {
            newList.add(ints[i]);
            sum = sum + newList.get(i);
        }
        var avgArray = (float) sum / newList.size();
        System.out.println("Average of array: " + avgArray);
        return avgArray;
    }

    // Ex. 3
    private static void ex3() {
        doubleArray(new ArrayList<>());
    }
    private static void doubleArray(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0;i < ints.length; i++) {
            newList.add(ints[i]);
            newList.set(ints[i], (2*newList.get(ints[i])));
        }
        System.out.println(newList);
    }
}
