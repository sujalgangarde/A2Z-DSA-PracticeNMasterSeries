
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

    static int magicNum(int n){
        int ans = 0;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
    
    // EvenOdd
        int n = 12;
        System.out.println(isdOdd(n));

    // Find num which appears only once
        int[] arr = {2, 3, 4, 2, 3};
        System.out.println(findUnique(arr));

    // same as above but num apear 3 times and ans apear once
        //HW

    // nth Magic Number
        System.out.println(magicNum(n));


    }
}
