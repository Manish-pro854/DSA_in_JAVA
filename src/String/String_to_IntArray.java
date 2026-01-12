package String;

import java.util.ArrayList;
import java.util.Scanner;

public class String_to_IntArray {
    public static int ConvertToInt(String str){
        int convertedValue = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int num = ch-'0';

            convertedValue = convertedValue*10+num;
        }
        return convertedValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        String[] sarr = str.split(",");

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i< sarr.length; i++){
            String str_val = sarr[i];

            int int_value = ConvertToInt(str_val);
            res.add(int_value);
        }
            System.out.println(res);
    }
}
