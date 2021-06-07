package ex09;

import java.util.Scanner;
import java.lang.Math;

/*
Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
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
