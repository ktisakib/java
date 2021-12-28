package lab7.ex2;


// Java program to illustrate the
// concept of Multilevel inheritance

class one {
	public void print_java()
	{
		System.out.println("Java");
	}
}

class two extends one {
	public void print_is() { System.out.println("is"); }
}

class three extends two {
	public void print_easy()
	{
		System.out.println("Easy");
	}
}

// Drived class
public class Main {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_easy();
		g.print_is();
		g.print_easy();
	}
}

