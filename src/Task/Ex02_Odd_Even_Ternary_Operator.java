package Task;

public class Ex02_Odd_Even_Ternary_Operator {
    public static void main(String[] args) {
        int number =10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
