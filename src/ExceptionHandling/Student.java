package ExceptionHandling;

public class Student {

    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public void  validateMarks() throws IllegalArgumentException
    {
        if(marks<0 || marks>100)
        {
            throw new IllegalArgumentException();
        } else if (marks >=40) {
            System.out.println(marks+" "+"Pass");
        }
        else {
            System.out.println(marks+" "+"fail");
        }
    }
}


class Stu
{
    public static void main(String[] args) {

        Student student=new Student(32,"Jai");

        student.validateMarks();

    }
}