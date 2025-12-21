package Functions;

import java.util.Scanner;

public class CountFrequencyNumber {
    public static int countfrequentdigit(int n, int d){
        int count = 0;
        while(n>0){
            int digit = n%10;
            if(digit==d){
                count++;
            }
            n = n/10;
        }
        return  count;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(countfrequentdigit(n, d));
    }
}
