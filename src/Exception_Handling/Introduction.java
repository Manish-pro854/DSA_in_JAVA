package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Introduction {
    static void main(String[] args) {
        System.out.println("Hello World");

//        ERRORS =========
//        int[] arr = new int[Integer.MAX_VALUE - 1];
//        recurse();
//        String ans = 10;
        //=============================================================

        //EXCEPTIONS =======
        //Compile time exception
        try {
            FileReader fileReader = new FileReader("minku.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Run time exception
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader("minku.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IllegalAccessException("Invalid Argument - Created by minku");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IllegalAccessException("Invalid Argument - Created by minku expection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}
