package JavaTest;

import java.util.Scanner;

public class ZipCode
{
    public static void main(String args[])
    {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the ZipCode");
        n=s.nextInt();
        switch (n)
        {
            case 600020:
                System.out.println("Adyar");
                break;
            case 600004:
                System.out.println("Mylapore");
                break;
            case 6000020:
                System.out.println("Nungambakkam");
                break;
            default:
                System.out.println("Invalid Zipcode");
        }
    }
}
