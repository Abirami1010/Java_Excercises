package Ex_04_Java_Intermediate_Logic_Building;

import java.util.Scanner;

public class Lab062_Interview_Qstn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day between 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    } // Nothing will happen if we enter integer value other than 1 or 2
}
