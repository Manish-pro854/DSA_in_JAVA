package Functions;

import java.util.Scanner;

public class Place_Value_Checker {
    public static int DetermineSecondLastDigit(int n){
        int ld = n%10;
        n = n/10;
        int res = n%10;
        return res;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = DetermineSecondLastDigit(n);
        if(res==0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
