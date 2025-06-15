package Ex_05_Java_Intermediate_Logic_Building;

public class Lab084_For_Loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            // System.out.println(i); // 0 1 2 3 4 5
            if (i == 5) {
               // System.out.println(i); //5
                break;
            }
            System.out.println(i); //0 1 2 3 4
    }
} }
// Note: Based on where statement "System.out.println(i);" present out put will vary