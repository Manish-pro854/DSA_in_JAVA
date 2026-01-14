package OOPS;
//Non static methods channot change static variables
//you can call static methods directly without creating object
//Non-static functins can use static variables and also non satic variables
class statics {
    String name;
    int age;
    static int total_students = 0;

    public statics(String name, int age){
        this.name = name;
        this.age = age;
        this.total_students++;
    }

    //only static methods use static variables
    public static void printTotalStudent(){
        System.out.println("Total Students are "+ total_students);
    }

}
public class Static {
    static void main(String[] args) {
        //static => relate to class, not object

        statics s1 = new statics("A", 10);
        statics s2 = new statics("B", 20);

        System.out.println(s1.total_students); //2

        System.out.println(s1.name);
        System.out.println(s2.name);

        //static is same for everyone if one changed it then other also accessed the changed value
        s1.total_students = 20;
        System.out.println(s2.total_students);

        statics s3 = new statics("E", 200);
        s3.printTotalStudent();

    }
}
