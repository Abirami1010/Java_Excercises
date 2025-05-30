package Ex_03_Java_Basics;

public class Lab049_Nested_Ternary {
    public static void main(String[] args) {
        int number =27;
        String result = (number >18) ? ( number >25 ? "You can drink" : "You can't drink" ) : "You can't Go";
        System.out.println(result);
    }
}
