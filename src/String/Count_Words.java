package String;

import java.util.Scanner;

public class Count_Words {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                continue;
            }

            count++;
            int j = i;

            while(j<n && str.charAt(j)!=' '){
                j++;
            }
            i = j;
        }
        System.out.println(count);
    }
}
