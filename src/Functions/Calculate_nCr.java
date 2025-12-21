package Functions;

import java.util.Scanner;
public class Calculate_nCr {
    public static long fact(long x){
        long ans = 1;
        for(int i=1; i<=x; i++){
            ans = ans*i;
        }
        return  ans;
    }
     public static long calculate_ncr(long n, long r) {
        long fact_n = fact(n);
        long fact_r = fact(r);
        long fact_n_r = fact(n-r);
        long res = fact_n/(fact_r*fact_n_r);
        return res;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ans = calculate_ncr(n, r);
        System.out.println(ans);
    }
}
