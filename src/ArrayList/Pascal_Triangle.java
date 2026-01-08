package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascal_Triangle {
    public static ArrayList<ArrayList<Integer>> pascaltriangle(int numRows){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> past = new ArrayList<>();
        past.add(1);
        ans.add(past);

        int total_number_of_rows = numRows-1;

        while(total_number_of_rows>0){
            ArrayList<Integer> curr = new ArrayList<>();

            for(int i=1; i<past.size(); i++){
                int csum = past.get(i)+ past.get(i-1);
                curr.add(csum);
            }
            curr.add(0,1);
            curr.add(1);

//one way
//            System.out.println(curr);

            //second way
//            ans.add(curr);

            ArrayList<Integer> temp = new ArrayList<>(curr);
            ans.add(temp);
            past = curr;
            total_number_of_rows--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascaltriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
