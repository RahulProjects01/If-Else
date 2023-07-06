
//================================================================================================
// Q.2 ---- Java program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit cesius---------------------

// Program :- 

import java.util.Scanner;

public class File_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter to 'C' to convart fahrenheit to celsius and press 'F' celsius to fahrenheit: ");
        char userInput = sc.next().charAt(0);
        float temp;
        if (userInput == 'c') {
            System.out.print("Enter the temperature: ");
            int temperature = sc.nextInt();
            temp = (temperature - 32) * 5 / 9;
            System.out.println(temp);
        } else if (userInput == 'f') {
            System.out.print("Enter the temperature: ");
            int temperature = sc.nextInt();
            temp = (temperature * 5 / 9) + 32;
            System.out.println(temp);
        } else {
            System.out.print("Invalid Answer");
        }
    }
}
