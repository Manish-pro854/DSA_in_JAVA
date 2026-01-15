package OOPS.Abstraction;

//If we define a class abstract then we write abstract before class and then extends this class
//with another child class then child class also have all the abstract function if not then
//the function is not working.
abstract class Vehicle{
    public void printA(){
        System.out.println("Printing A!!!");
    }

    abstract public int sum(int a, int b);
    abstract public void printB();
}

class car extends Vehicle{
    public int sum(int a, int b){
        return  a + b;
    }

    public void printB(){
        System.out.println("Printing B!!!");
    }
}

public class Introduction {
    static void main(String[] args) {
        car c = new car();
        System.out.println(c.sum(2,3));
        c.printB();
    }
}
