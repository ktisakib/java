package lab9.ex1;

public class Teacher {
    public void name(){
      System.out.println("The name of Java Course Teacher");   
   }
}
class JiabulHoque extends Teacher {
       @Override
       public void name(){
        System.out.println("Jiabul Hoque");
    }
    public static void main(String args[]){
    	Teacher obj = new JiabulHoque();
    	obj.name();
    } 
}

