public class Methdoverload
{
    void test()
    {
        System.out.println(" NO Parameters");
    }
    void test(int a)
    {
        System.out.println("a:"+a);
    }
    void test(int a, int b)
    {
        System.out.println(" a and b:" + a +" " +b);
    }
}
class Overload
{
    public static void main(String args[])
    {
        Methdoverload ob=new Methdoverload();
        ob.test();
        ob.test(10);
        ob.test(10,20);
    }
}
