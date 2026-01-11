package Array_Practice;

public class SubArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        //how to find subarray indices
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                System.out.println("Subarray from " + start + " to " + end);
            }
        }

        //printing all subarray
        int[] arr1 = {1, 2, 3};

        for(int i = 0; i < arr1.length; i++){
            for(int j = i; j < arr1.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
