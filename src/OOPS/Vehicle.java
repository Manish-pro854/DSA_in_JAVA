package OOPS;

class Vehicles {
    String color;
    int engine;
    int model_number;

    //this is called method => A function that is formed in a class
    public void presshonk(){
        System.out.println("PppppPPPppp");
    }

    public Vehicles(String newColor){
        System.out.println("Default Constructor is called!!!!!!!!!!");
        this.color = newColor;
    }

    //2. Perametrized constructor with String
    public Vehicles(String newColor, int newengine){
        this(newColor);
        System.out.println("Second Perametrized Constructor is called with String!!!!!!!!!!");
        this.engine = newengine;
    }

    //3. Perametrized constructor with String and int
    public Vehicles(String newColor, int newengine, int newModelNumber){
        this(newColor, newengine);
        System.out.println("Third Perametrized Constructor is called with String and int!!!!!!!!!!");
        this.model_number = newModelNumber;
    }

}

public class Vehicle {
    static void main(String[] args) {
        Vehicles v1 = new Vehicles("BLACK", 400, 9);
        System.out.println(v1.color);
        System.out.println(v1.engine);
        System.out.println(v1.model_number);
        v1.presshonk();
    }
}
