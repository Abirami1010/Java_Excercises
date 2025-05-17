package Ex_01_Java_Basics;

public class Lab014_Byte {
    public static void main(String[] args) {
        //memory can only save 0 and 1 (only decimal)

        byte b=10;  // 10 will be converted into binary and stored in memory

        //1 Byte = 8 Bits
        // byte range -128 to 127
        // Decimal to Binary   10 =00001010
        // 128 10000000 - It gets overflow, can't be stored in memory
        System.out.println(b);
    }
}
