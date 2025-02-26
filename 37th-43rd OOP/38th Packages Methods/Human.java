public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("static method");
        // System.out.println(this.age); cant use 'this' bcz it depends on obj and staticMethod is not 

    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population += 1; this runs but it gives warning for good practice'(static must call by its class name)'
        Human.population += 1;

        // this.message(); gives warning that dont use 'this' keyword for static use classname
        Human.message();
    }


}
