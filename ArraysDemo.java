package javaprogram;

class ArraysDemo
{
    public static void main (String[] args)
    {

        int a[];

        a = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ a[i]);
    }
}
