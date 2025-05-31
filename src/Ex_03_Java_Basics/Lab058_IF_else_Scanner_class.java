package Ex_03_Java_Basics;

import java.util.Scanner;

public class Lab058_IF_else_Scanner_class {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in); // to get real time input
        int age = scanner.nextInt();

        if (age>18)
        {
            System.out.println("You can Vote");
        }
        else {
            System.out.println("You can't vote");
        }
    }
}
