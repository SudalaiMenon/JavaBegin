abstract class Abstrac
{
    abstract  void run();
    void print()
    {
        System.out.println("Hello");
    }
}
class Im extends  Abstrac
{
    void run()
    {
        System.out.println(" Hai im runnning");
    }
    public static void main(String args[])
    {
        Im obj=new Im();
        obj.run();
        obj.print();
    }
}