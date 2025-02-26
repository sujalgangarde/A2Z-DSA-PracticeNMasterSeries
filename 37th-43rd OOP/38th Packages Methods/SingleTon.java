
// class in which we can have only have one object
// logic : Not to allow any one to access or call constructor i.e. making it private and replacing it with new method which allows only one instance/object
public class SingleTon {

    private SingleTon(){

    }

    private static SingleTon instance;

    public static SingleTon getInst(){
        System.out.println("Something");
        if(instance == null){
            new SingleTon();
        }
        return instance;
    }

}
