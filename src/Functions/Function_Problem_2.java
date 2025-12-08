package Functions;

import java.util.Scanner;

public class Function_Problem_2 {
    public static void fun(int a, int b){
        int add = a+b;
        System.out.println(add);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fun(a,b);
    }
}
