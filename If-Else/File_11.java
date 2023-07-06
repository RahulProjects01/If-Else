
// Q.12 ----------------------five number max ----------------------------------

// Program :- 

import java.util.Scanner;

public class File_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 number");
        int num1 = sc.nextInt();
        System.out.print(num1);

        System.out.print("Enter num2 number");
        int num2 = sc.nextInt();
        System.out.print(num2);

        System.out.print("Enter num3 number: ");
        int num3 = sc.nextInt();
        System.out.print(num3);

        System.out.print("Enter num4 number: ");
        int num4 = sc.nextInt();
        System.out.print(num1);

        System.out.print("Enter num5 number: ");
        int num5 = sc.nextInt();
        System.out.print(num5);

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("num1 is greter" + num1);
        }

        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("num2 is greter" + num2);
        }

        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("num3 is greter" + num3);
        } else if (num4 > num1 && num4 > num3 && num4 > num2 && num4 > num5) {
            System.out.println("num4 is greter" + num4);
        } else {
            System.out.println("num5 is greter" + num5);
        }
    }
}
