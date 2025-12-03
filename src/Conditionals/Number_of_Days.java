package Conditionals;

import java.util.Scanner;

public class Number_of_Days {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int ans = 1;
        if(M==2){
            ans = 28;
        } else if(M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12) {
            ans = 31;
        }else{
            ans = 30;
        }
        System.out.println(ans);
    }
}
