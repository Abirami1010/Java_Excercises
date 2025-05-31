package Task;

public class Ex05_Increment_Op {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;  // i++=11 then store i=12 + ++i= 1+i=1+12=13  (11 + 13)
        System.out.println(i);
    }
}
