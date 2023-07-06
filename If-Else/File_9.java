
// Q.10 ------------- Electric city bil ---------------------------------------------------------------------------------------

// 1-10 = 10%
// 11-20 = 15%
// 21-40 = 30%
// 50 = 50%

// output :- name,unit,amount, discount,total pay amount

// Program:- 

import java.util.Scanner;

public class File_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("name: " + name);

        System.out.print("Enter your unit: ");
        int unit = sc.nextInt();
        System.out.println("unit: " + unit);

        System.out.print("Enter your unit Amount: ");
        int unitAmount = sc.nextInt();
        System.out.println("unit Amount: " + unitAmount);

        if (1 <= unit && unit < 10) {
            System.out.print("your bil: ");
            float discount = unit * 0.90f;
            System.out.println("discount: " + discount + "%");
        } else if (unit >= 11 && unit <= 20) {
            System.out.print("Your bil: ");
            float discount = unit * 0.85f;
            System.out.println("discount: " + discount + "%");
        } else if (unit >= 21 && unit <= 40) {
            System.out.print("Your bil: ");
            float discount = unit * 0.70f;
            System.out.println("discount: " + discount + "%");
        } else if (unit >= 50) {
            System.out.print("Your bil: ");
            float discount = unit * 0.50f;
            System.out.println("discount: " + discount + "%");
        } else {
            System.out.print("Wrong input");
        }

        float total = unitAmount * unit;
        System.out.println("Total Amount: Rs-" + total);
    }
}
