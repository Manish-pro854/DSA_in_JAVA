package Java_Basics.Data_types;

import java.util.Scanner;

public class Char_to_Int_viceversa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //change char to int = implicit
        int ascii = ch;
        ascii++;
        //now i again change the ascii value means int to char = explicit
        char chh = (char) ascii;
        System.out.println(ch);
        System.out.println(ascii);
        System.out.println(chh);
    }
}
