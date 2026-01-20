package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Multiple_Catch {
    static void main(String[] args) {
        try{
            int[] arr = new int[5];
            //If we did not comment this then ArrayIndexOutOfBound message printSystem.out.println(arr[6]);
            FileReader fileReader = new FileReader("Minku.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        //If one exception catch then remaining two is not catched
    }
}

