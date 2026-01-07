package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Introduction {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            int val = sc.nextInt();
            al.add(val);
        }

        int sum = 0;
        int product = 1;

        for(int i=0; i<al.size(); i++){
            int cv = al.get(i);
            sum = sum+cv;
            product = product*cv;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
