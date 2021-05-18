package javaprogram;

import java.io.*;
class Buffer {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("TestCoding");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of string TestCoding=" + p);
        System.out.println("Capacity of string TestCoding=" + q);
    }
}
