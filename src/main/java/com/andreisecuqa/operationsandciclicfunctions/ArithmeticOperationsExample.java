package com.andreisecuqa.operationsandciclicfunctions;

public class ArithmeticOperationsExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 12;

        System.out.println("The sum is: " + (a + b));

        System.out.println("The dif is: " + (a - b));

        int div = a / b;
        System.out.println("The div is: " + div);

        double a1 = a;
        double b1 = b;
        double div2 = (double) a / b;
        System.out.println("The div is: " + div2);

        System.out.println("The multiplication is: " + (a1 * a));

        System.out.println("The remainder is: " + ( a % b));

        // Write a program that will change the values of the variables, as an output you have to get a = 12 and b = 5;

//        int temp = a;
//        a = b;
//        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}