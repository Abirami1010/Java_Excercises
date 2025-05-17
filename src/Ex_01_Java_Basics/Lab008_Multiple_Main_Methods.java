package Ex_01_Java_Basics;

public class Lab008_Multiple_Main_Methods {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    //public static void main(String[] args) {  } --We should not have exact same main method

    //Main Method over loading
    public static void main(String args) {
        System.out.println("String");
    }

    public static void main(int args) {
        System.out.println(12345);

    }
    // Interview question : can we have multiple main method
    // Answer: There can be multiple main method but only one is recognized by JVM
    // Exact same methods name can't be used

    //Main Method over loading
    // Multiple methods with different name can be used
    // but not printing value
    // not recognized by JVM as method

    // Function==Methods in Java
}
