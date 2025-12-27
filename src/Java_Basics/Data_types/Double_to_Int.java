package Java_Basics.Data_types;

import java.util.Scanner;

public class Double_to_Int {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 5;
        double c = 2.0;
        System.out.println("Divided two ints gives int value: "+ a/b);
        System.out.println("Divided one int and other double gives double value: "+ a/c);
        System.out.println(c/a);
        //convert int to long and double is in implicit typecasting

        //double average if we have two int inputs
        double average = a+b/2.0;
        System.out.println(average);

        //if we want to convert double to int then we do explicit typecasting
        double toint = 10.78;
        int ans = (int) toint;
        System.out.println(ans);
    }
}
