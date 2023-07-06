//===============================================================================================
// Q.11 Retailer - r = > 1-15 = 15% //  discount 
//                       16-30 = 30%  //  discount 
//                       31-50 = 50% //  discount 
//               output :- 
//                       Reatailer name:-
//                       Peicies:- 
//                       Discount:- 
//      Costomer - c  => 100 - 1000 = 10% //  discount 
//                       1000 - 2000 = 5% //  discount 
//                       3000 above = 30% //  discount 

// Program:- 

import java.util.Scanner;

public class File_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter r for Retailer and c for costomer: ");
        char userInput = sc.next().charAt(0);

        if (userInput == 'r') {
            System.out.print("Please enter your name: ");
            String name = sc.next();

            System.out.print("Please enter your peicies: ");
            int peicies = sc.nextInt();

            System.out.println("Reatailer Name: " + name);
            System.out.println("Peicies: " + peicies);

            if (peicies >= 1 && peicies <= 15) {
                float discount = peicies * 0.90f;
                System.out.println("Discount: " + discount + "%");
            } else if (peicies >= 10 && peicies <= 30) {
                float discount = peicies * 0.70f;
                System.out.println("Discount: " + discount + "%");
            } else if (peicies >= 31 && peicies <= 50) {
                float discount = peicies * 0.50f;
                System.out.println("Discount: " + discount + "%");
            } else {
                System.out.println("you are wrong input");
            }

        } else if (userInput == 'c') {
            System.out.print("Please enter your name: ");
            String name = sc.next();

            System.out.print("Please enter your contect number: ");
            int number = sc.nextInt();

            System.out.print("Please enter your Payment: ");
            int payment = sc.nextInt();

            System.out.println("Costumer Name: " + name);
            System.out.println("Contect number: " + number);
            System.out.println("Payment: " + payment);

            if (payment >= 1000 && payment <= 2000) {
                float discount = payment * 0.95f;
                System.out.println("Discount: " + discount + "%");
            } else if (payment >= 100 && payment <= 1000) {
                float discount = payment * 0.99f;
                System.out.println("Discount: " + discount + "%");
            } else if (payment >= 3000) {
                float discount = payment * 0.20f;
                System.out.println("Discount: " + discount + "%");
            } else {
                System.out.println("you are wrong input");
            }

        } else {
            System.out.print("Invalid input");
        }
    }
}
