package lab9.ex2;



public class Student {
    public void name(){
      System.out.println("The name of Student:");   
   }
}
class StudentAdded extends Student {
       @Override
       public void name(){
           System.out.println("Kazi Tanvirul Islam");
    }
    public static void main(String args[]){
    	Student obj = new StudentAdded();
    	obj.name();
    } 
}

