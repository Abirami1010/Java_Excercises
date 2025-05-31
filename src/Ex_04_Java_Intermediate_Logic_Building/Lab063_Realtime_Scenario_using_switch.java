package Ex_04_Java_Intermediate_Logic_Building;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab063_Realtime_Scenario_using_switch {
    public static void main(String[] args) {
        // Write the program to test app with user selected browser

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= scanner.next();
        browser =browser.toLowerCase(); // handling upper case to match with given string names below
        // it will handle CHROME, CHrome, Chrome...etc

        switch (browser)
    {
        case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
         case "edge":
                 System.out.println("starting the edge browser");
                // write remaining code for test case
                 break;
         case "firefox":
                System.out.println("starting the firefox browser");
                // write remaining code for test case
                break;
        default:
            System.out.println("Enter the right name of browser");
            break;
        }
        System.out.println("END OF THE PROGRAM");
    }
}
