package Ex_04_Java_Intermediate_Logic_Building;

public class Lab070_JDK13above {
    public static void main(String[] args) {
        int item_code=006;

        switch (item_code)
        {
            case 001,002,003: // Multiple case can be added together, Implemented in JDK13 and above versions
                System.out.println("CSE CODE");
                break;
            case 004,005,006:
                System.out.println("MECH CODE");
                break;
            default:
                System.out.println("Not available");
        }
    }
}
