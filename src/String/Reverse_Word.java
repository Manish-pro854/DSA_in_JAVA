package String;

import java.util.Scanner;

public class Reverse_Word {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sarr = str.split(" ");
        int n = sarr.length;
        String res = "";

        for(int i=n-1; i>=0; i--){
            res += sarr[i];
            res += " ";
        }
        System.out.println(res);
    }
}
