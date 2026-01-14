package OOPS.Polymorphism;

class Bank{
    public int rateofinterest(){
        return 5;
    }
}

class SBI extends Bank{
    public int rateofinterest(){
        return 3;
    }
}

class HDFC extends Bank{
    public int rateofinterest(){
        return 7;
    }
}

class ICICI extends Bank{
    public int rateofinterest(){
        return 4;
    }
}

public class Question {
    static void main(String[] args) {
        Bank b; //compile time b is type of bank

        b = new HDFC(); //run time polymorphism achive by method overriding also called late or dynamic binding
        System.out.println(b.rateofinterest());

        b = new SBI();
        System.out.println(b.rateofinterest());  //method overriding

        b = new ICICI();
        System.out.println(b.rateofinterest());
    }
}
