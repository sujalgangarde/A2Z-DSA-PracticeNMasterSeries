
public class A {

    int a; // default access modifier : it does not allow in other package
    private int num; // private access modifier : it does not allow in other class without getter and setter
    protected String name; // protected access modifier : it allows in same package and also in subclass of other package
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }

}
