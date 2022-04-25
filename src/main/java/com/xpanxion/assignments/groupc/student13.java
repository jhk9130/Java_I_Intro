package com.xpanxion.assignments.groupc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class student13 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    //Ex. 1
    private static void ex1() {
        System.out.println("Ex. 1");
        addNumbers(new ArrayList<>());
    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        numList = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);
            sum = sum + numList.get(i);
        }
        System.out.println("List wrapped in Integer: " + numList);
        System.out.println("Sum of the array: " + sum);
        return 0;
    }

    //Ex. 2
    private static void ex2() {
        System.out.println("Ex. 2");
        avgNumbers(new ArrayList<>());
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        numList = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0;i < ints.length; i++) {
            numList.add(ints[i]);
            sum = sum + numList.get(i);
        }
        var avgArray = (float) sum / numList.size();
        System.out.println("Average of array: " + avgArray);
        return avgArray;
    }

    // Ex. 3
    private static void ex3() {
        System.out.println("Ex. 3");
        doubleArray(new ArrayList<>());
    }
    private static void doubleArray(ArrayList<Integer> numList) {
        int[] ints = {1, 2, 3};
        numList = new ArrayList<Integer>();
        for (int i = 0;i < ints.length; i++) {
            numList.add(2*ints[i]);
        }
        System.out.println("Double array: " + numList);
    }

    // Ex. 4
    private static void ex4() {
        System.out.println("Ex. 4");
        Scanner sc = new Scanner(System.in);
        var maxNum = sc.nextInt();
        System.out.println("Enter value to create list: " + maxNum);
        createList(maxNum);
    }
    private static void createList(Integer maxNumber) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            newList.add(i+1);
        }
        System.out.println(newList);
    }

    private static void ex5() {

    }

}
