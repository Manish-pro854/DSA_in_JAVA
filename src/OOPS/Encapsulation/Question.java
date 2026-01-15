package OOPS.Encapsulation;

class Teacher {
    String name;
    private int salary;

    // Setter
    public void setSalary(int newSalary){
        if(newSalary > 300){
            this.salary = 0;
        } else {
            this.salary = newSalary;
        }
    }

    // Getter
    public int getSalary(String password){
        if(password.equals("lola")){   // ✅ fixed
            return this.salary;
        } else {
            System.out.println("chala ja bsdk");
            return -1;
        }
    }
}

public class Question {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setSalary(250);

        System.out.println(t1.getSalary("lola"));  // prints salary
        System.out.println(t1.getSalary("wrong")); // prints error message
    }
}
