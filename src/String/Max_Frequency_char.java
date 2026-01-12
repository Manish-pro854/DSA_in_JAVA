package String;

import java.util.Scanner;

public class Max_Frequency_char {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        int[] fre = new int[26];

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int idx = ch-'a';
            fre[idx]++;
        }

        int maxFre = 0;
        char maxFreChar = '$';

        for(int i=0; i<26; i++){
            if(fre[i]>maxFre){
                maxFre = fre[i];
                maxFreChar = (char)(i+'a');
            }
        }
        System.out.println(maxFreChar);
    }
}
