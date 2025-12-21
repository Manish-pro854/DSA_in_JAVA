package Functions;

import java.util.Scanner;

public class Calculate_npr {
    public static long fact(long x){
        long ans = 1;
        for(int i=1; i<=x; i++){
            ans = ans*i;
        }
        return ans;
    }
    public static long calculate_npr(long n, long p){
        long n_fact = fact(n);
        long n_p_fact = fact(n-p);
        long res = n_fact/n_p_fact;
        return res;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long p = sc.nextInt();
        long ans = calculate_npr(n, p);
        System.out.println(ans);
    }
}
