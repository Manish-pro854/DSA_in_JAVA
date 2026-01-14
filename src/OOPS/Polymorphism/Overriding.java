package OOPS.Polymorphism;

class Vehicless{
    String color;

    public void honk(String str){
        System.out.println("A vehicle function");
    }
}

class Carss extends Vehicless {
    String engineType;

    @Override
    public void honk(String str){
        System.out.println("A car function");
    }
}


public class Overriding {
    static void main(String[] args) {
        Carss c1 = new Carss();
        c1.honk("Minku");

        Vehicless obj = new Vehicless();
        obj.honk("Kida");

        Vehicless objs = new Carss();//upcasting
        objs.honk("Kida");
    }
}
