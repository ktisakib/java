package lab7.ex1;

// Java program to illustrate the
// concept of Hierarchical inheritance

class Planates {
	public void print_earth() { System.out.println("Planate:"); }
}

class Mars extends Planates {
	public void print_mars() { System.out.println("Mars"); }
}

class Neptune extends Planates {
	public void print_nept() { System.out.println("Neptune"); }
}

class Saturn extends Planates {
	public void print_sat() { System.out.println("Saturn"); }
}

// Driver Class
public class Test {
	public static void main(String[] args)
	{
		Mars obj_Mars = new Mars();
		obj_Mars.print_earth();
		obj_Mars.print_mars();

		Neptune obj_Neptune = new Neptune();
		obj_Neptune.print_earth();
		obj_Neptune.print_nept();

		Saturn obj_Saturn = new Saturn();
		obj_Saturn.print_earth();
		obj_Saturn.print_sat();
	}
}

