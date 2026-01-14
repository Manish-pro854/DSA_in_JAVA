package OOPS;

class Student {
    String name;
    int roll_no;

    public void makeNoise(){
        System.out.println("Making Noise!!!!!");
    }

    public int sum(int a, int b){
        return a+b;
    }
    public String toString(){
        return "Notty hora h ke behan ke lund!!!!!!"+ name;
    }
}
public class Introduction {
    static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Accio";
        s1.roll_no = 1;

        Student s2 = new Student();

        s2.name = "Minku";
        s2.roll_no = 2;

        System.out.println(s1);
        System.out.println(s2);

        s1.makeNoise();
        System.out.println(s1.sum(5,5));
    }
}
