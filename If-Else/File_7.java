
// Q.8 ---------- Three number max used only if else , dont use else if 

// Program:- 

import java.util.Scanner;

public class File_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println(num2);

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();
        System.out.println(num3);

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.print("num1 is greter: " + num1);
            } else {
                System.out.print("num3 is greter: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.print("num2 is greter: " + num2);
            } else {
                System.out.print("num3 is greter: " + num3);
            }
        }
    }

}