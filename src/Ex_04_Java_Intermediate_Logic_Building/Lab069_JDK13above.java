package Ex_04_Java_Intermediate_Logic_Building;

public class Lab069_JDK13above {
    public static void main(String[] args) {
        int item_code=001;

        switch (item_code)
        {
            case 001 -> System.out.println("001");  // -> can be used instead of break; implemented in jdk13 and above versions
            case 002 -> System.out.println("200");
            case 003 -> System.out.println("300");
            default -> System.out.println("default");
        }

    }
}
