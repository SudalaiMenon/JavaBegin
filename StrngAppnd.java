package javaprogram;

import java.io.*;
class StrngAppnd {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Welcome ");
        s.append("College");
        System.out.println(s);
        s.append(7);
        System.out.println(s);
    }
}
