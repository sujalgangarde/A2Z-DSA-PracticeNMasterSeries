
import java.util.ArrayList;
import java.util.function.Consumer;


public class LambdaFun {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(4);
        arr.add(2);

        Consumer<Integer> fun = (item) -> {
            System.out.println(item * 2);
        };
        arr.forEach(fun);
        System.out.println();

        // arr.forEach((item)-> {
        //     System.out.println(item * 2);
        // });

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        System.out.println(sum.operate(3, 4));
        System.out.println(sub.operate(3, 4));
        System.out.println(mul.operate(3, 4));
        System.out.println(div.operate(3, 4));

    }

    int doubleit(int a) {
        return a * 2;
    }

}

interface Operation {
    int operate(int a, int b);
}