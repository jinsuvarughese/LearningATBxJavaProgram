package ex_14072024;

public class Lab0058 {
    public static void main(String[] args) {
     int course=100;
     float GST =18.45F;
     //int total_price=course+GST;//impilcit narrowing-jvm
        int total_price=course+(int)GST;//explit narrowing- real time- money loss
        System.out.println(total_price);
    }
}
