package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an hour of time");
        int hour = keyboard.nextInt();
        hour = (hour % 12);



        System.out.println("Enter minutes of time");
        int minute = keyboard.nextInt();
        minute = (minute % 60);



        System.out.printf("The time is: %d:%02d",hour,minute);




    }
}
