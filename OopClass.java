import java.io.*;
import java.util.Scanner;
class OopClass
{
    public static void main(String args[])
    {
        fun o=new fun();
        o.add();
    }
}
class fun
{
    private int a,b;
    public void add()
    {
        Scanner in= new Scanner(System.in);
                System.out.println("\n Enter the value of a and b");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("\n Total :"+(a+b));

    }
}
