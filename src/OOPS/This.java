package OOPS;

//Constructor chaining using this keyword
//Constructor chaining helps in repitetion time wastage
//RULES :-
//=>First line should be constructor call
//=>There should be atleast one constructor with no further call
class Studentss {
    String name;
    int Rollno;
    int marks;

    public Studentss(){
        System.out.println("Default Constructor is called!!!!!!!!!!");
    }

    //2. Perametrized constructor with String
    public Studentss(String newName){
        System.out.println("Second Perametrized Constructor is called with String!!!!!!!!!!");
        this.name  = newName;
    }

    //3. Perametrized constructor with String and int
    public Studentss(String newName, int newRollNo){
        this(newName);
        System.out.println("Third Perametrized Constructor is called with String and int!!!!!!!!!!");
        this.Rollno = newRollNo;
    }


    //4. Perametrized constructor with String, int, marks
    public Studentss(String newName, int newRollNo, int newMarks){
        System.out.println("Fourth Perametrized Constructor is called with String,int,marks!!!!!!!!!!");
        this(newName,newRollNo);
        this.marks = newMarks;
    }
}
public class This {
    static void main(String[] args) {
        Studentss s1 = new Studentss("Manish",200, 500);
        System.out.println(s1.name);
        System.out.println(s1.Rollno);
        System.out.println(s1.marks);
    }
}
