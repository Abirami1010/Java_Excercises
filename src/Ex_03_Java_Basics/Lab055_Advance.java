package Ex_03_Java_Basics;

import org.w3c.dom.ls.LSOutput;

public class Lab055_Advance {
    public static void main(String[] args) {
        int a=10;
        System.out.println( a++ + a); // a++ =10; a=11  =21

        int b=10;
        System.out.println(b++ + ++b);// b++=10 but store b=11  +  ++b= 11+1=12 so 10 +12  =22
        System.out.println(b);

        int c=10;
        System.out.println(++c + ++c); // ++c=11 then again ++c=11+1+12  so 11+12=23

        int d=10;
        int e=--d; //9
        System.out.println(d);
        System.out.println(e);
    }
}
