// Q.9 ----------------------
// salalry :
// holidays (1) =full salary 
// 2-5 =5% 
// 5-14 =10% 
// 15 =50% 
// else =not salary 

// PROGRAM :- 

import java.util.Scanner;

public class File_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("name: " + name);

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.println("salary: " + salary);

        System.out.print("Enter your holiday: ");
        int holidays = sc.nextInt();
        System.out.println("holidayas: " + holidays);

        if (holidays == 1 || holidays == 0) {
            System.out.print("Your total salary after charging paid leaves: " + salary);
        } else if (holidays >= 2 && holidays <= 5) {
            System.out.print("Your total salary after charging paid leaves: ");
            float cutSalary = salary * 0.95f;
            System.out.println("Alot: " + cutSalary);
        } else if (holidays >= 5 && holidays <= 14) {
            System.out.print("Your total salary after charging paid leaves: ");
            float cutSalary = salary * 0.90f;
            System.out.println("Alot: " + cutSalary);
        } else if (holidays >= 15 && holidays <= 50) {
            System.out.print("Your total salary after charging paid leaves: ");
            float cutSalary = salary * 0.50f;
            System.out.println("Alot: " + cutSalary);
        } else {
            System.out.print("Not salary");
        }
    }
}
