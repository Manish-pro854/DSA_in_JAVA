package OOPS;

//constructor = Function with name is same as class with no return type.
//Two types of constructors
class Students {
    String name;
    int Rollno;

    //1.Default constructor
    //default constructor=there are no perameter in this
    public Students(){
        name = "Minku";
        Rollno = 27;
        System.out.println("Default Constructor is called!!!!!!!!!!");
    }

    //2. Perametrized constructor with String
    public Students(String newName){
        System.out.println("Perametrized Constructor is called with string!!!!!!!!!!");
        name = newName;
    }
    //2. Perametrized constructor with int
    public Students(int newRollNo){
        System.out.println("Perametrized Constructor is called with int!!!!!!!!!!");

    }
    //2. Perametrized constructor with String and int
    public Students(String newName, int newRollNo){
        System.out.println("Perametrized Constructor is called with String and int!!!!!!!!!!");
        name  = newName;
        Rollno = newRollNo;
    }
}
public class Constructor {
    static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        System.out.println(s1.Rollno);

        s1.name = "Materia";
        System.out.println(s1.name);

        s1.name = "Baveria";
        System.out.println(s1.name);


        Students s2 = new Students("Hello");

        Students s3 = new Students(100);

        Students s4 = new Students("Manish",200);
        System.out.println(s4.name);
        System.out.println(s4.Rollno);
    }
}
