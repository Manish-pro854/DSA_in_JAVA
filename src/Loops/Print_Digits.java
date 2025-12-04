package Loops;

import java.util.Scanner;

public class Print_Digits {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String NumbertoString = Integer.toString(n);
        for(int i=0; i<=NumbertoString.length(); i++){
            System.out.println(NumbertoString.charAt(i));
        }
    }
}
