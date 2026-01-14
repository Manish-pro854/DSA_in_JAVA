package OOPS.Polymorphism;

class Vehicles{
    String color;

    public void honk(int a){
        System.out.println("A vehicle function");
    }
}

class Cars extends Vehicles {
    String engineType;

    //Compile time polymorphism
    //Achieve by this:-
    //method overloading=>Change the parameter values or datatypes
    public void honk(String str){
        System.out.println("A car function");
    }
}

public class Introduction {
    static void main(String[] args) {
        Cars c1 = new Cars();
//        c1.honk(); //A vehicle function
        c1.honk(2); //A vehicle function
        c1.honk("Minku"); //A car function
    }
}
