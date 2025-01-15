
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

    static int setBits(int n){
        int count = 0;

        // while(n>0){
        //     count++;
        //     n -= (n & -n);
        // }

        // OR

        while(n>0){
            count++;
            n = n & (n-1);
        }

        return count;
    }

    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
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

    // Find a power b
        int base = 3;
        int power = 6;
        int answer = 1;

        while(power>0){
            if((power&1)==1){
                answer*=base;
            }
            base*=base;
            power = power >> 1;
        }
        System.out.println("Power: "+answer);

    // find no of set bits in a number
        int c = 10;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(setBits(c));

    // XOR all numbers between range a to b
        // xor of a,b = xor(b) ^ xor(a-1);
        int x = 4;
        int y = 9;
        int result = xor(y) ^ xor(x-1);
        System.out.println(result);
        // OR
        int result2 = 0;
        for (int i = x; i <= y; i++) {
            result2 ^= i;
        }
        System.out.println(result2);


        
    }
}
