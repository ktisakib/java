package raisul;
class Student
{
int id;
String name;
}
//Creating another class TestStudent which contains the main method
class TestStudent
{
public static void main(String args[])
{
Student s1=new Student();
System.out.println(s1.id);
System.out.println(s1.name);
}
}