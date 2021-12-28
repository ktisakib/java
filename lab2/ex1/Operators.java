package lab2.ex1;


public class Operators {
  /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

    int A = 30, B = 40, C, D = 10, E = 17, F;
    //Arithmetic Operator
    System.out.println("We take Variable AS: A=30,B=40,C,D=10,E=17,F\n");
    C = A + B;
    System.out.println("Arithmetic Operator Output: A+B=" + (C));
    //Relational Operator
    System.out.println("Relational Output:(A == B) is " + (A == B));
    //Logical Operator
    System.out.println("Logical Operator Output:(A&&B)is " + (A < B && D < E));
    //Bitwise Operator
    System.out.println("Bitwise Operator Output: (A & B)=" + (A & B));
    //Assignment Operator
    D += E;
    System.out.println("Assignment Operator Output: D+=E :" + (D));
    //Misc Operator
    F = Integer.SIZE / 8;
    System.out.println("MISC Operator Output: sizeof(A)=" + (F));
  }
}



