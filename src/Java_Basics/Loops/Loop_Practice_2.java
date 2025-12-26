package Java_Basics.Loops;

import java.util.Scanner;

public class Loop_Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Reverse a number
        int n = sc.nextInt();
        int number = n;
        int reverse = 0;
        int sum = 0;
        while(number>0){
            int ld = number%10;
            sum = sum+ld;
            reverse = reverse*10+ld;
            number = number/10;
        }
        System.out.println(reverse);

        //****************************************************space between
        System.out.println();

        //Check whether a number is palindrome
        if(n==reverse){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }

        //space *****************************************************************
        System.out.println();

        //Find factorial of a number
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);


        //space***************************************************************
        System.out.println();

        //Find sum of digits
        System.out.println(sum);

        //space******************************************************************
        System.out.println();

        //Check whether a number is Armstrong
        int nn = sc.nextInt();
        int nnumber = nn;
        int ssum = 0;
        while(nnumber>0){
            int ddigit = nnumber%10;
            ssum += ddigit*ddigit*ddigit;
            nnumber /= 10;
        }
        if(ssum==nn){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not a armstrong");
        }
    }
}
