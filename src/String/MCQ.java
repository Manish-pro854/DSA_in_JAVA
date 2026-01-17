package String;

import java.util.Scanner;

public class MCQ {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anskey = sc.nextLine();
        int n = anskey.length();

        String minku = "ABC";
        String ankit = "BABC";
        String chinku = "CCAABB";

        int minkuScore = 0;
        int ankitScore = 0;
        int chinkuScore = 0;

        for(int i=0; i<n; i++){
            char currAns = anskey.charAt(i);

            if(currAns == minku.charAt(i%3)){
                minkuScore++;
            }
            if(currAns == ankit.charAt(i%4)){
                ankitScore++;
            }
            if(currAns == chinku.charAt(i%6)){
                chinkuScore++;
            }
        }
         int maxScore = Math.max(minkuScore,Math.max(ankitScore,chinkuScore));
        if(maxScore==minkuScore){
            System.out.println("Minku Pass");
        }
        if(maxScore==ankitScore){
            System.out.println("Ankit Pass");
        }
        if(maxScore==chinkuScore){
            System.out.println("Chinku Pass");
        }
    }
}