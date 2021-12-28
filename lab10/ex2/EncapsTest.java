package lab10.ex2;

// Java program to demonstrate encapsulation
class Student {

    private String StudentName;
    private int StudentRoll;
    private int StudentAge;

    public int getAge() {
        return StudentAge;
    }

    public String getName() {
        return StudentName;
    }

    public int getRoll() {
        return StudentRoll;
    }

    public void setAge(int newAge) {
        StudentAge = newAge;
    }

    public void setName(String newName) {
        StudentName = newName;
    }

    public void setRoll(int newRoll) {
        StudentRoll = newRoll;
    }
}

public class EncapsTest {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

    }
}