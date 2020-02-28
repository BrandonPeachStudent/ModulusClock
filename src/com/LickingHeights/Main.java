package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an hour of time");
        int hour = keyboard.nextInt();

        int answer = hour >= 13 ? 1 : 0;
        answer = hour >= 14 ? 2 : 0;
        answer = hour >= 15 ? 3 : 0;
        answer = hour >= 16 ? 4 : 0;
        answer = hour >= 17 ? 5 : 0;
        answer = hour >= 18 ? 6 : 0;
        answer = hour >= 19 ? 7 : 0;
        answer = hour >= 20 ? 8 : 0;
        answer = hour >= 21 ? 9 : 0;
        answer = hour >= 22 ? 10 : 0;
        answer = hour >= 23 ? 11 : 0;
        answer = hour >= 24 ? 12 : 0;

        System.out.println("Enter minutes of time");
        int minute = keyboard.nextInt();






    }
}
