package lab7.ex1;

// Java program to illustrate the
// concept of Multilevel inheritance

 
class level1 {
	public void print_l1()
	{
		System.out.println("level one");
	}
}

class level2 extends level1 {
	public void print_l2() { System.out.println("Level two"); }
}

class level3 extends level2 {
	public void print_l3()
	{
		System.out.println("level three");
	}
}

// Drived class
public class Main {
	public static void main(String[] args)
	{
		level3 g = new level3();
		g.print_l1();
		g.print_l2();
		g.print_l3();
	}
}

