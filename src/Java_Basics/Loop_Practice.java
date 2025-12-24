package Java_Basics;

import java.util.Scanner;

public class Loop_Practice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print number from 1 to 100
        for(int i=1; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        //Print even number between 1 to 50
        for(int i=1; i<=50; i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        //Find sum of first N natural numbers
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.print(sum);

        System.out.println();
        System.out.println();

        //Print multiplication table of a number
        int a = sc.nextInt();
        int table = 0;
        for(int i=1; i<=10; i++){
            table = a*i;
            System.out.println(table);
        }

        System.out.println();
        System.out.println();

        //Count number of digits in a number
        int number = sc.nextInt();
        int count = 0;

        while(number>0){
         int digit = number%10;
         count++;
         number = number/10;
        }
        System.out.println(count);
    }
}
