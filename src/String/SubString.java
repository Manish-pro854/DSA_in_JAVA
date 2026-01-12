package String;

import java.util.Scanner;

public class SubString {
    public static String SubStr(String str, int si, int ei){
        String ans = "";
        int i = si;
        while(i<=ei){
            char ch = str.charAt(i);
            ans = ans+ch;
            i++;
        }
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String subString = SubStr(str, i, j);
                System.out.println(subString);
            }
        }
    }
}
