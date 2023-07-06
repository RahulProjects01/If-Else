// Q.5 java program to enter student marks and find persantage and grade A collage has the following  rules for the grading system -------------

// Program:- 


import java.util.Scanner;

public class File_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of following subjects to check you result : ");

        System.out.println("English");
        int eng = sc.nextInt();

        System.out.println("Math");
        int math = sc.nextInt();

        System.out.println("Hindi");
        int hindi = sc.nextInt();

        float marks = (eng + math + hindi);
        float Percentage = marks / 3;

        System.out.println("Percentage: " + Percentage + "%");
        if (Percentage < 25) {
            System.out.print("grade - F");
        } else if (Percentage >= 25 && Percentage <= 45) {
            System.out.print("grade -E");
        } else if (Percentage >= 45 && Percentage <= 50) {
            System.out.print("grade -E");
        } else if (Percentage >= 50 && Percentage <= 60) {
            System.out.print(" grade - D");
        } else if (Percentage >= 60 && Percentage <= 80) {
            System.out.print("grade -B");
        } else if (Percentage <= 80) {
            System.out.print("grade -A");
        } else {
            System.out.println("invalid value");
        }

    }
}
