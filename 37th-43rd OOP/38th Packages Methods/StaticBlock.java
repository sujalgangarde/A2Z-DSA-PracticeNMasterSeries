public class StaticBlock {

// To show initialization of static variables : make a static block which get executed once when first-time class is loaded.
    static int a = 4;
    static int b;

    static {
        System.out.println("Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
        StaticBlock.b += 3;
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b); // static block is only ran 'once'


    }


}
