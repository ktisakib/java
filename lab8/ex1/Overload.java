package lab8.ex1;

class Overload
{
    void test (int a)
    {
       System.out.println ("a: " + a);
    }
    void test (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double test(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}

class MethodOverloading {
    public static void main(String args[]) {
        Overload Obj = new Overload();
        double result;
        Obj.test(20);
        Obj.test(20, 40);
        result = Obj.test(3.3);
        System.out.println("RESULT : " + result);
    }
}
