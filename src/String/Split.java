package String;

import java.util.Scanner;

public class Split {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        //This is not work here it works only for special character
        String[] sarr = str.split(" ");
        for(String e: sarr){
            System.out.println(e);
        }
    }
}
