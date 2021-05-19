class A
{
int a=10;
private void displayA()
{
System.out.println("A value is:"+a);
}
//
//public class Private
// {
    public static void main(String args[])
    {
        A obj=new A();
        obj.displayA();
    }
}