package Ex_04_Java_Intermediate_Logic_Building;

public class Lab077_For_Loop_WO_Condition {
    public static void main(String[] args) {
        for (int i=0; ;i++)  // For loop without condition will create infinite loop
            System.out.println(i);
    }
}
// For loop without condition will create infinite loop
// Need to stop it manually - exit code 130 (Process finished with exit code 130)
// success - code 0  (Process finished with exit code 0)
