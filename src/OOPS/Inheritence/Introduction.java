package OOPS.Inheritence;

class Vehicle{
    String color;
    int releaseYear;

    public Vehicle(){
        System.out.println("Parent Constructor");
    }

    public void honk(){
        System.out.println("A vehicle function");
    }
}

class Car extends Vehicle{

public Car(){
//    super keyword as like this keyword we use this to call parent
    super(); //call parent constructor
    super.honk(); //parent class function
//    super.color; //parent class attribute
    System.out.println("Child Constructor");
}

public void honk(){
    System.out.println("A car function");
}
}

class Bike extends Car{
    int cc;
}
public class Introduction {
    static void main(String[] args) {
//        Car c1 = new Car();
        Bike b1 = new Bike();
        b1.honk();
    }
}
