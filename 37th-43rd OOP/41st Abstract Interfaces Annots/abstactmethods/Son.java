
public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void abstractMethod(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
         
        Son s = new Son(12);
        s.abstractMethod("Sujal");

        Parent.staticMethod();


    }

}
