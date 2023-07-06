// Q.4 java program to check whether a character is an alphabet or not
// input =a =alpha 
// 3 =this is a digit

// PROGRAM :- 

import java.util.Scanner;

public class File_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character to check, it is an alphabet or not: ");
        char input = sc.next().charAt(0);

        if (input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') {
            System.out.println("This is an alphabet: ");
        } else {
            System.out.print("This is Digit: ");
        }
    }
}