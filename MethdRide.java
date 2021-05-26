public class MethdRide
{
    public void move()
    {
        System.out.println("Animal can move");
    }
}
class dog extends  MethdRide
{
    public void move()
    {
        System.out.println("Dogs can walk and run");

    }
}
class Testdog
{
    public static void main(String args[])
    {
        dog b=new dog();
        b.move();
    }
}
