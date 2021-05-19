package Default;

class A
{
    int a=7878;
    void displayA()
    {
        System.out.println("A value is: "+a);
    }
}
class B extends A
{
    int b=20;
    void displayB()
    {
        System.out.println("B value is: "+b);

    }
}
public class Default
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.displayA();
    }
}
