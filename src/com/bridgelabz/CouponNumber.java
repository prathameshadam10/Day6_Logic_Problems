package com.bridgelabz;

import java.util.Random;

public class CouponNumber {
    public static int generateRandomNumber(int n){
        Random rand = new Random();
        return rand.nextInt();
    }

    public static int[] generateDistinctCoupons(int n) {
        int[] coupons = new int[n];
        int count = 0;

        while (count < n) {
            int coupon = generateRandomNumber(n);
            boolean isDistinct = true;

            for (int i = 0; i < count; i++) {
                if (coupons[i] == coupon) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                coupons[count] = coupon;
                count++;
            }
        }
        return coupons;
    }
    public static  int findTotalRandomNumber(int n){
        int[] coupons = new int[n];
        int count = 0;
        int randomCount = 0;

        while (count < n){
            int coupon = generateRandomNumber(n);
            randomCount++;
            boolean isDistinct = true;

            for(int i = 0; i < count; i++){
                if (coupons[i] == coupon){
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct){
                coupons[count] = coupon;
                count++;
            }
        }
        return randomCount;
    }

    public static void main(String[] args) {
        int n = 10;
        int [] coupons = generateDistinctCoupons(n);
        System.out.println("Distinct coupon number :");
        for (int i = 0; i < n; i++){
            System.out.println(coupons[i] + " ");

        }
        System.out.println();
        int totalRandomnumbers = findTotalRandomNumber(n);
        System.out.println("Total random numbers needed to have all distinct numbers :" + totalRandomnumbers);
    }
}
