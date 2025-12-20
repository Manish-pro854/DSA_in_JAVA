package Functions;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static long binarytodecimal(long binarynumber) {
        long res = 0;
        long curr_pow_of_two = 1;
        while(binarynumber>0){
            long ld = binarynumber%10;
            res = res+ld*curr_pow_of_two;
            binarynumber = binarynumber/10;
            curr_pow_of_two = curr_pow_of_two*2;
        }
        return res;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binarynumber = sc.nextInt();
        System.out.println(binarytodecimal(binarynumber));
    }
}
