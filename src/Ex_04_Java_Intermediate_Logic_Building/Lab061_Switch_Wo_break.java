package Ex_04_Java_Intermediate_Logic_Building;

import java.util.Scanner;

public class Lab061_Switch_Wo_break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Please enter value between 1 to 7");
        }
        System.out.println("END OF THE PROGRAM");
    }
}
