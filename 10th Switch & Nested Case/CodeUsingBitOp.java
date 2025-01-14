
public class CodeUsingBitOp {
    
    static boolean isdOdd(int n){
        return (n & 1) == 1;
    }

    static int findUnique(int[] arr){
        int uni = 0;
        for (int n : arr) {
            uni ^= n;
        }
        return uni;
    }

    public static void main(String[] args) {
    
    // EvenOdd
        int n = 12;
        System.out.println(isdOdd(n));

    // Find num which appears only once
        int[] arr = {2, 3, 4, 2, 3};
        System.out.println(findUnique(arr));

    

    }
}
