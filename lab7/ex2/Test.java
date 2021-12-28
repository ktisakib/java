package lab7.ex2;

// Java program to illustrate the
// concept of Hierarchical inheritance

class A {
	public void print_A() { System.out.println("Branch A"); }
}

class B extends A {
	public void print_B() { System.out.println("Branch B"); }
}

class C extends A {
	public void print_C() { System.out.println("Branch C"); }
}

class D extends A {
	public void print_D() { System.out.println("Branch D"); }
}

// Driver Class
public class Test {
	public static void main(String[] args)
	{
		B obj_B = new B();
		obj_B.print_A();
		obj_B.print_B();

		C obj_C = new C();
		obj_C.print_A();
		obj_C.print_C();

		D obj_D = new D();
		obj_D.print_A();
		obj_D.print_D();
	}
}

