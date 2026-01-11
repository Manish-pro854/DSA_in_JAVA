package String;

import java.util.Scanner;

public class Pangram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean[] arr = new boolean[26];

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                int idx = ch-'a';
                arr[idx] = true;
            }else if(ch != ' '){
                char newCh = Character.toLowerCase(ch);
                arr[newCh-'a'] = true;
            }
        }
        boolean isPangram = true;

        for(int i=0; i<n; i++){
            if(arr[i]==false){
                isPangram = false;
            }
        }
        if(isPangram==true){
            System.out.println("Pangram");
        }else{
            System.out.println("is not Pangram");
        }
    }
}
