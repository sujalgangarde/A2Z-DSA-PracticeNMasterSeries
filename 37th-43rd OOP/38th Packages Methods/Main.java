// package packages;
// package 38th Packages Methods;

public class Main {

    // depend on object : belong to instances
    void greet(){
        System.out.println("hi");
        fun(); // can call static
    }

    static void fun(){
        // greet();
        // fun() is not depends on obj so how can we use obj dependent in this so cant use.
    }

    void fun2(){
        // here no worry bcz to call fun2() there must be an object calling it.
        greet();
    }

    public static void main(String[] args) {
        
// packages : It is just a folders which stores java classes in compartments. which helps to manage same class names files.
    // Here a and b are packages containing same name class without error
    // There is some error bcz of folders name. to access from other packages it must public

// Human.java
        
        Human h1 = new Human(21, "sujal", 10000, false);
        Human h2 = new Human(34, "Kunal", 20000, true);
        System.out.println(h1.name);
    
    // some properties are not logically related to object i.e. object independent that is 'static' 
        // so static property(variables, functions) can be access using 'class name' itself and while calling it calls all created objects before it.
        System.out.println(Human.population);
        // why main is statsic : static is something which does not need object to run hence to run main without object creation of anything.. bcz main is the very first thing to run in program
        
        // we 'cant use non static in static' 
        // greet();
        // access through object
        Main o = new Main();
        o.greet();

    // SingleTon obj = new SingleTon(); error bcz private
    // in following no new obj is created it is only recalling same one
        SingleTon o = SingleTon.getInst();
        SingleTon o1 = SingleTon.getInst();
        SingleTon o2 = SingleTon.getInst();


    }
}
