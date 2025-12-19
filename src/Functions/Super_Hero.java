package Functions;

import java.util.Scanner;

public class Super_Hero {
    public static String ModifyName(String name){
        return name +  " is a super hero";
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));
    }
}
