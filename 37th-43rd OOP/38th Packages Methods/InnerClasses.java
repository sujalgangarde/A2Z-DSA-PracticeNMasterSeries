
// Outside class can not be static 
// static class A {} gives error

public class InnerClasses {

    // this class is depend on outer class 
    static class Test { // if static then independent of obj of outer class
        String name;

        public Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("Sujal");
        Test b = new Test("Don");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}
