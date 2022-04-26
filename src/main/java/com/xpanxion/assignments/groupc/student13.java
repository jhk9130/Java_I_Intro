package com.xpanxion.assignments.groupc;

import java.util.ArrayList;

public class student13 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    // Ex. 1
    private static void ex1() {
        int[] ints = {1, 2, 3};

        System.out.println("Ex. 1");
        var numList = new ArrayList<Integer>();
        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);
        }
        var result = addNumbers(numList);
        System.out.println("Sum of the array: " + result);
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0;i < numList.size(); i++) {
            sum = sum + numList.get(i);
        }
        return sum;
    }

    // Ex. 2
    private static void ex2() {
        int[] ints = {1, 2, 3};

        var numList = new ArrayList<Integer>();
        for (int i = 0;i < ints.length; i++) { 
            numList.add(ints[i]);              
        }
        System.out.println("Ex. 2");
        var result = avgNumbers(numList);
        System.out.println("Average of the array: "+ result);
    }

    private static Float avgNumbers(ArrayList<Integer> numList) {
        int sum = 0;

        for (int i = 0;i < numList.size(); i++) {
             sum = sum + numList.get(i);
        }
        var avgArray = (float) sum / numList.size();
        return avgArray;
    }

    // Ex. 3
    private static void ex3() {
        int[] ints = {1, 2, 3};

        var numList = new ArrayList<Integer>();
        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);               
        }
        System.out.println("Ex. 3");
        doubleArray(numList);
    }

    private static void doubleArray(ArrayList<Integer> numList) {
        for (int i = 0;i < numList.size(); i++) {
            numList.set(i, 2*numList.get(i));
        }
        System.out.println("Double array list: " + numList);
    }
}
