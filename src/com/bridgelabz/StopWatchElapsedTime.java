package com.bridgelabz;

import java.util.Scanner;

public class StopWatchElapsedTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch :");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println("Press Enter again to stop the stopwatch :");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time :" + elapsedTime + " :milliseconds .");
    }
}
