package ex09;

import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        final int paintConv = 350;

        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int area = length * width;

        float paintNeeded = area/paintConv;

        double paintRounded = Math.round(paintNeeded + .5);


        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.", paintRounded, area);




    }

}
