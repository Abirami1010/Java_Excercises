package Task;

public class Ex04_Age_Classification_using_TO {
    public static void main(String[] args) {
        int age=100;

        String result = age < 18 ? "Minor" : ((age > 65 ? "Senior Citizan" : "Adult"));
        System.out.println(result);
    }
}
