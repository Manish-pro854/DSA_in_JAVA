package OOPS.Abstraction;

//It is 100% abstraction
//all methods are abstract
interface Shape{
    public void draw();
    public void area();
}

interface V{
    public void draw();
}

class Rectangle implements Shape, V{  //MULTIPLE INHERITANCE
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void area() {
        System.out.println("Find in yourself");
    }
}
class Circle implements Shape{
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void area() {
        System.out.println("Find in yourself");
    }
}
public class Interface {
    static void main(String[] args) {
//        Circle c = new Circle();
//        c.draw();

        Shape s;
        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
