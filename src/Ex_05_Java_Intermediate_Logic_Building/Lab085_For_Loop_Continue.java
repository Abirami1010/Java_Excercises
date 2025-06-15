package Ex_05_Java_Intermediate_Logic_Building;

public class Lab085_For_Loop_Continue {
    public static void main(String[] args) {

        for (int i=0; i<=10; i++) {

            if (i == 5)
            {
                continue; // Skips printing 5

            }
            System.out.println(i);
        }
    }
}
