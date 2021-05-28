package Constructor;

public class ConstructorEx
{
    int i;
    Integer j;
    String name1=null;
    String name;
    String hi;

    private ConstructorEx(int j)
    {
        this.i=j;
        System.out.println("Contructor initial argument:"+i);

    }
    protected ConstructorEx(String name) {
        this(10);
        this.name = name;
        System.out.println("No Argument Constructor:" + name);
    }
    public ConstructorEx() {
        this("welcome");
        this.i = i;
        System.out.println("Constructor after passing with argument:" + i);
        System.out.println("Constructor after passing with argument:" + j);
    }
    public static void main(String[] args)

    {
        ConstructorEx ExampleConstructor = new ConstructorEx();
        ConstructorEx exampleconstructor = new ConstructorEx();



    }
}
