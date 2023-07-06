// Q.3-- Check whether the trainge , square , reactanlge (area & volume)------------------------------------------------
// ->input area /volume 
// aria
// tringle square rectengle
// square
// ----------------------------
// Program :- 


import java.util.Scanner;

public class File_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("FOR TRIANGLE -> t \nFOR SQUARE -> s \nFOR RECTANGLE -> r \nENTER THE SHAPE: ");
        char s = sc.next().charAt(0);

        System.out.print("AREA (a)/PARAMETER(p)??: ");
        char c = sc.next().charAt(0);

        if (s == 's') {
            System.out.print("enter the side of square: ");
            int a = sc.nextInt();
            if (c == 'a') {
                System.out.print("Aria of square: ");
                int b = a * a;
                System.out.print(b);
            }
            if (c == 'p') {
                System.out.print("PARAMETER of square: ");
                int p = sc.nextInt();
                p = 4 * a;
                System.out.println(p);
            }
        } else if (s == 'r') {
            System.out.print("enter the length rectangle: ");
            int a = sc.nextInt();
            System.out.print("enter the width of rectangle: ");
            int b = sc.nextInt();
            if (c == 'a') {
                System.out.print("Aria of square: ");
                int f = a * b;
                System.out.print(f);
            }
            if (c == 'p') {
                System.out.print("PARAMETER of square: ");
                int p = sc.nextInt();
                p = 2 * (a + b);
                System.out.println(p);
            }
        } else if (s == 't') {
            System.out.print("enter the base of triangle: ");
            int a = sc.nextInt();
            System.out.print(" heigh of triangle: ");
            int b = sc.nextInt();
            if (c == 'a') {
                System.out.print("Aria of square: ");
                int f = (a + b) / 2;
                System.out.print(f);
            }
            if (c == 'p') {
                System.out.print("PARAMETER of square: ");
                int p = sc.nextInt();
                p = a + b + c;
                System.out.println(p);
            }

        } else {
            System.out.println("Invalid entry");
        }

    }
}
