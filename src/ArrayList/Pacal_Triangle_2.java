package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Pacal_Triangle_2 {
    public static ArrayList<Integer> pascaltriangle(int numRows){

        ArrayList<Integer> past = new ArrayList<>();
        past.add(1);

        int total_number_of_rows = numRows-1;

        while(total_number_of_rows>0){
            ArrayList<Integer> curr = new ArrayList<>();

            for(int i=1; i<past.size(); i++){
                int csum = past.get(i)+ past.get(i-1);
                curr.add(csum);
            }
            curr.add(0,1);
            curr.add(1);

            past = curr;
            total_number_of_rows--;
        }
        return past;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> triangle = pascaltriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i) + " ");
        }
    }
}