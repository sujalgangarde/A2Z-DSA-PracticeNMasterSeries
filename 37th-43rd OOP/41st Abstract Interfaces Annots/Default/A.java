
public interface A {

    default void fun(){
        System.out.println("A.fun()");
    }

    static void staticFun(){
        System.out.println("static function");
    }

}
