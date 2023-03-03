package com.bridgelabz;
// Write a program weather the number is prime number or not.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        int num = sc.nextInt();
        if ( num < 2){
            x = true;
        } else{

            for (int i = 2; i <= num / 2; ++i) {

                if (num % i == 0) {
                    x = true;
                    break;
                }
            }
        }
        if (!x)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}




