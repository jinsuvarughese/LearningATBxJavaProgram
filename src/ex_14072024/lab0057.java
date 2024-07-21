package ex_14072024;

public class lab0057 {
    public static void main(String[] args) {
    long phone_no=9876543210L;
    //short  s =phone_no;//implict narrowing-jvm
        short s=(short) phone_no;
        System.out.println(s);

    }
}
