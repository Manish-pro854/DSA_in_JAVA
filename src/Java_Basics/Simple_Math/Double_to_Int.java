package Java_Basics.Simple_Math;

public class Double_to_Int {
    static void main(String[] args) {
        double a = 4.0;
        double b = 1.0;
        //change double to int
        double ans = a*(1-(b/3)+(b/5)-(b/7)+(b/9)-(b/11));
        System.out.println(ans);

        //If we want to convert int to double so we do not need anything we do it smoothly but
        // if we want to convert double into int then we do,
        //double a = 10.0;
        //int b = int a;
    }
}
