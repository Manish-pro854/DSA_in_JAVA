package Array;

public class Swap_numbers {
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
