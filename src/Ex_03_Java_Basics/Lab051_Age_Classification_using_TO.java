package Ex_03_Java_Basics;

public class Lab051_Age_Classification_using_TO {
    public static void main(String[] args) {
        // Adult > 18;  Minor <18; Senior < 65;

        String user_input = args[0]; // argument value configured in Edit configuration, click on screen name above, edit configuration, enter value in CLI arguments field

        // System.out.println(user_input); // Value will be printed as string, but should be int
         //System.out.println(user_input instanceof String); // check if its string

         int age= Integer.parseInt(user_input); //change string into int
         //System.out.println(age);

         String result =  age < 18 ? "Minor" : ((age < 65 ? "Adult" : "Senior" )) ;
         System.out.println(result);


    }
}
