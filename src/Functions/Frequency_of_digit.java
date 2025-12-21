package Functions;

import java.util.Scanner;

public class Frequency_of_digit {
    public static int frequent_of_digit(long n, int d){
        int count = 0;
        while(n>0){
            long digit = n%10;
            if(digit==d){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(frequent_of_digit(n, d));
    }
}
