package Ex_04_Java_Intermediate_Logic_Building;

import java.util.Scanner;

//Switch Statements
// Multiple Condition or statements.
// Java switch statement executes **one statement **from **multiple conditions.**
//⚠️ Java switch expressions must be of only byte, short, int, long(with its Wrapper type), enums and String.

public class Lab060_Switch_Statement {
    public static void main(String[] args) {

        //Logic Building
        // Step 1: Using scanner
        // Step 2: Figuring out expressing and day
        // Step 3: draft rough logic
        // Step 4: fix the logic & Optimize (adding break)
        // Step 5: figure out edge cases (adding if condition)

       //Printing days of week based on input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");

        //int day = scanner.nextInt();

        if (scanner.hasNext()) //important: remember the keyword hasNext
        {
            int day = scanner.nextInt();

            switch (day) {

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter value between 1 to 7");
            }

        } else {
            System.out.println("Please enter integer value");
        }
        System.out.println("END OF THE PROGRAM");
    }
    }

