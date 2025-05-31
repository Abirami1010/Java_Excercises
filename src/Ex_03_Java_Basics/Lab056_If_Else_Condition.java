package Ex_03_Java_Basics;

public class Lab056_If_Else_Condition {
    public static void main(String[] args) {
    int age=Integer.parseInt(args[0]);
    // Value given argument fields are always string so change into int parser will be used
    if (age > 18)
    {
        System.out.println( "You can Vote"); // Input Given in Arguments field in edit configuration
    }
else
    {
        System.out.println("You can't Vote");
    }
    }
}
