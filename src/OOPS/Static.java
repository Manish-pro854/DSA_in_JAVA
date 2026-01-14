package OOPS;

class statics {
    String name;
    int age;
    static int total_students = 0;

    public statics(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Static {
    static void main(String[] args) {
        //static => relate to class, not object

        statics s1 = new statics("A", 10);
        statics s2 = new statics("B", 20);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
