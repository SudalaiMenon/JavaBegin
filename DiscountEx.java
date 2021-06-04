class DiscountEx
{
    public static void main(String args[])
    {

        double  discount,amount,Ac,s;

        Ac=25000;

        discount=5;   //5%

        System.out.println("AC Cost= "+Ac);

        System.out.println("discount rate="+discount);

        s=100-discount;

        amount= (s*Ac)/100;

        System.out.println("amount after discount="+amount);

    }
}
