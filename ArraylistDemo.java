package collections;
import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(40);
        al.add("tamil");
        al.add("false");
        al.add("e");
        al.add(6, "nadu");
        System.out.println(al);
        System.out.println(al.add(90));
        System.out.println(al);
        System.out.println(al.size());


    }
}
