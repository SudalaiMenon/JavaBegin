package AccessSpacifier;

class A
{
    int a=555;
    protected void displayA()
    {
        System.out.println("A value is: "+a);
    }
}
class B extends A
{
    int b=20;
    private void displayB()
    {
        System.out.println("B value is: "+b);

    }
}
public class Protected
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.displayA();
    }
}