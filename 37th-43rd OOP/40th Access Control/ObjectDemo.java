// package 40th Access Control;

public class ObjectDemo {

    int num;

    

    public ObjectDemo(int num) {
        this.num = num;
    }


    @Override
    public int hashCode() {
        return num;
        // it gives number implementation of variable in memory
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo o = new ObjectDemo(34);
        System.out.println(o.hashCode());

        ObjectDemo o1 = new ObjectDemo(34);
        System.out.println(o1.hashCode());
        System.out.println(o.equals(o1)); // false
    }

}
