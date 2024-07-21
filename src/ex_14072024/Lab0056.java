package ex_14072024;

public class Lab0056 {
    public static void main(String[] args) {
        // type casting - source and destination converstion
        // Widening-Implicit, explict-lossless
        //Narrowing-Implicit,explicit(with data type), loss of data

        //widening
        byte b=10;
        int a=b; // VALID – Implicit Casting- jvm
        int a1 = (int)b; // VALID – Explicit Casting
        System.out.println(a1);


        // narrowing
        int val=456;
        //byte b1=val; // INVALID – Implicit Casting
        byte b1 = (byte)val; // INVALID – Explicit Casting// loss of data
        System.out.println(b1);
    }
}
