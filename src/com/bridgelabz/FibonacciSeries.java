package com.bridgelabz;
// Write Program for fibonacci series.
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fiboncci series");
        int number = sc.nextInt();

        int a = 0, b = 1;

        System.out.print (a + " , " + b + " , ");

        int nextTerm;

        for (int i = 2; i<number; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print (nextTerm + " , ");
        }


    }
}
