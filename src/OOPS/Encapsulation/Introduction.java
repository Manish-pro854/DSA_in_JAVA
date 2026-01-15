package OOPS.Encapsulation;

class Vehicle{
    private int wheels; //only use in within the class not used in child class also or other
    protected String color; //it is also used in another program but within the same package
    int releaseYear;
}

class Car extends Vehicle{
    public void changewheels(){
        //It also throw error because parent class wheels is private
//        super.wheels = 5;
    }
}

public class Introduction {
    static void main(String[] args) {
        Vehicle v1 = new Vehicle();
//        v1.wheels = 4; // throw an error because wheels are private
    }
}
