package Functions;

import java.util.Scanner;

public class Function_Problem_3 {
    public static int fun (int n){
        for(int i=0; i<5; i++){
            i++;
        }
        return n;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fun(n);
        System.out.println(result+5);
    }
}
