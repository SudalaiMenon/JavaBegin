package Public;

class A
{
    int a=777;
    public void displayA()
    {
        System.out.println("A value is: "+a);
    }
}
class B extends A
{
    int b=20;
    public void displayB()
    {
        System.out.println("B value is: "+b);

    }
}
public class Public
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.displayA();
    }
}