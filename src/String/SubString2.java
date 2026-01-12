package String;

import java.util.Scanner;

public class SubString2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            String subString = "";
            for(int j=i; j<n; j++){
                subString += str.charAt(j);
                System.out.println(subString);
            }
        }
    }
}
