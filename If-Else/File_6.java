
//  write a java program to accept the hight of a person in centimeters and categorize the person according to their height ( mid,low,high).

// Program:- 

import java.util.Scanner;

public class File_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centemitter: ");
        int height = sc.nextInt();
        int value = height / 100;
        // System.out.print(value);
        if (value >= 150) {
            System.out.print("  Low ");
        } else if (height >= 150 && height <= 170) {
            System.out.print(" Mid ");
        } else {
            System.out.println("   high ");
        }

    }
}