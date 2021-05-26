class AW {
    public void print_A() { System.out.println("Class A"); }
}

class BW extends AW {
    public void print_B() { System.out.println("Class B"); }
}

class CW extends AW {
    public void print_C() { System.out.println("Class C"); }
}

class DW extends AW {
    public void print_D() { System.out.println("Class D"); }
}

// Driver Class
class HierachiInher {
    public static void main(String[] args)
    {
        BW obj_B = new BW();
        obj_B.print_A();
        obj_B.print_B();

        CW obj_C = new CW();
        obj_C.print_A();
        obj_C.print_C();

        DW obj_D = new DW();
        obj_D.print_A();
        obj_D.print_D();
    }
}
