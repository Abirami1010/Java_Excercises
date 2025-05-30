package Task;

import org.w3c.dom.ls.LSOutput;

public class Ex03_Max_between_3_number_using_TO {
    public static void main(String[] args) {

    int N1 = 10;
    int N2 = 20;
    int N3 = 30;
    int MAX_No = N1 > N2 ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);
        System.out.println(MAX_No);
}
}

