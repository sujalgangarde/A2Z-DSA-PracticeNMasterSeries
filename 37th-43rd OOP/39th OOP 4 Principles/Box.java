
public class Box {
    int l;
    int h;
    int w;
    public Box(int l, int h, int w) {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(int l) {
        this.l = l;
        this.h = l;
        this.w = l;
    }

    Box(Box b) {
        this.l = b.l;
        this.h = b.h;
        this.w = b.w;
    }

    public void information(){
        System.out.println("Length: " + l + " Height: " + h + " Width: " + w);
    }
}

class Inheritance {

    public static void main(String[] args) {

    }

}
