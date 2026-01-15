package OOPS.Encapsulation;

class Student{
    String name;
    int roll_no;
    private int marks;


    public char getGrade(){
        if(this.marks >= 85){
            return 'A';
        }else if(this.marks >= 60){
            return 'B';
        }else if(this.marks >= 45){
            return 'C';
        }else if(this.marks >= 33) {
            return 'D';
        }else{
            return 'F';
        }
    }

    public void setMarks(int marks){
        if(marks > 100 || marks < 0){
            System.out.println("Not Possible!!");
        }else{
            this.marks = marks;
        }
    }

    public int getMarks(int marks){
        return this.marks;
    }

}

public class Student_Question {
    static void main(String[] args) {
        Student s = new Student();

        s.setMarks(85);
        System.out.println(s.getGrade());

        s.setMarks(45);
        System.out.println(s.getGrade());

        s.setMarks(-5);
        System.out.println(s.getGrade());
    }
}
