//------------- Leap year ---------------------

// Program :- 

import java.util.Scanner;

public class File_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.print("Leap year");
        } else {
            System.out.print("This year is not Leap year");
        }
    }
}
