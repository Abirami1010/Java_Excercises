package Ex_05_Java_Intermediate_Logic_Building;

public class Lab083_Odd_or_Even_Top50_For_Loop {
    public static void main(String[] args) {

        // TO find the even numbers from 1 to 50
        // even -> i%2 ==0

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
            }

        }

    }
}
