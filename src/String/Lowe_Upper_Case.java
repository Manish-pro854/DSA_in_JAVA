package String;

import java.util.Scanner;

public class Lowe_Upper_Case {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String ans = "";
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            char newCh = 'a';

            if(ch>='a' && ch<='z'){ //is Lower Case
                newCh = Character.toUpperCase(ch);
            }

            else if(Character.isUpperCase(ch)==true){  //is Upper Case
                newCh = Character.toLowerCase(ch);
            }
            else {
                newCh = ch; // for spaces or symbols
            }
            ans += newCh;
        }
        System.out.println(ans);
    }
}
