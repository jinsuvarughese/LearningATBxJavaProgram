package ex20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // take  auser input check it is even or odd
        //logic building
        //1 figureout i/p
        // datatype= int
        // how to take i/p in java? - scanner -class
        //nextInt()-i/p

        //do we need conversion or directly
        //rough logic
        //optimize
        Scanner sc = new Scanner(System.in);// creation of obj in scanner cls
        System.out.println("Enter the no");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if (user_input % 2 == 0)
            System.out.println("Even");
    }
}
//    //else{
//
//    }
//
//    {
//        System.out.println("odd");
//    }
//}
