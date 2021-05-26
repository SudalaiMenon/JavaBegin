class E
{
    int a = 10;
    int b = 20;
}
class F extends E {
    int c = 30;
}
class G extends F
{
    int d = 40;
    G()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class Inher
{
    public static void main(String args[])
    {
        G obj =new G();
    }
}
