
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
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }

    static int pascalrowsum(int n){
        return 1 << n-1;
    }

    static boolean poweroftwo(int n){
        return (n & (n-1)) == 0;
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
        System.out.println("Magic Number: "+magicNum(5));

    // Number of digits in base 'b' of number 'n'
        int a = 89234;
        int b = 2;

        int nofdigits = (int)((Math.log(a)/Math.log(b)))+1;
        System.out.println("No of digits: "+nofdigits);

    // Find sum of nth row in pascal's triangle
        System.out.println("RowSum of Pascal's Triangle: "+pascalrowsum(5));
    
    // Find number is power of 2 or not
        System.out.println("Is Number power of 2: "+poweroftwo(8));

    
        


    }
}
