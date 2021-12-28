package lab5.ex1;

public class Eployee {

    
    // Java Program to illustrate how to define a class and fields
    // Defining a Emloyee class.
    // defining fields
    int id;// field or data member or instance variable
    String name;

    // creating main method inside the Emloyee class
    public static void main(String args[]) {
        // Creating an object or instance
        Eployee s1 = new Eployee();// creating an object of Emloyee
        // Printing values of the object
        System.out.println(s1.id);// accessing member through reference variable
        System.out.println(s1.name);
    }
}
