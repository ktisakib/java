package lab8.ex2;

public class Overload {
    static int add(int a,int b)
{
    return a+b;
}  
static int add(int a,int b,int c)
{
    return a+b+c;
}  
}  
class TestOverloading1{  
public static void main(String[] args)
{  
System.out.println(Overload.add(5,8));  
System.out.println(Overload.add(6,9,12));  
}
}

