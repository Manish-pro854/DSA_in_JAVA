package TWODArray;

public class Introduction {
    static void main(String[] args) {
        int [] [] arr = new int [5] [3];
        for(int i=0; i<arr.length; i++){
            int [] b = arr[i];

            for(int j=0; j<b.length; j++){
//                int ele = b[j];
                int ele = arr[i][j];
                System.out.println(ele);
            }
        }
    }
}
