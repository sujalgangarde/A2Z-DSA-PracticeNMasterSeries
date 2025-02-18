
class A{
    final int num = 10;
    String name;
    
    A(String name){
        // System.out.println("Obj created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
        super.finalize();
    }

    
}

public class Wrapper {
    
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        // Integer is a class having various methods
        Integer num1 = 45;
        Integer num2 = 56;
        // num.

        swap(a, b);
        swap(num1, num2);
        System.out.println(a+" "+b);
        System.out.println(num1+" "+num2);
    // here both are not swapping bcz in java there is no pass by reference Only pass by value.
    // Integer is class but it is 'final'(Constant) so it will also not be passed and swapped
    // 'final' keyword : make object/variable constant means immutable(can't modify).* final variable/object must initialize while declaring it
    // this is only for primitives that value can not modify but object/nonprimitive but can't re initialize again
        final A sujal = new A("Sujal Gangarde");
    // Allowed
        sujal.name = "OtherName";
    // Not Allowed
        // A sujal = new A("Other");

    // java calls finalize when loads on memory and frees space
        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("Random");
        }
    
    }

}
