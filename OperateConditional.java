package javaprogram;

public class OperateConditional
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=10;
        int d=20;
        System.out.println((a==b)&&(c==d));
        System.out.println((a==c)&&(b==d));
        System.out.println((a==c)||(b==d));
    }
}
