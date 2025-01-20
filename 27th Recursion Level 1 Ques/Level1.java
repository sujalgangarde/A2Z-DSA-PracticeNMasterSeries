
public class Level1{

    static void rec(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        rec(n-1);
    }

    static void recRev(int n){
        if (n==0) {
            return;
        }
        recRev(n-1);
        System.out.println(n);
    }

    static void recBoth(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        recBoth(n-1);
        System.out.println(n);
    }

    static int fact(int n){
        if (n<=1) {
            return 1;
        }
        return n * fact(n-1);
    }

    static int sum(int n){
        if (n==0) {
            return 0;
        }
        return n + sum(n-1);
    }

    static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }

    static void conceptSeq(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // conceptSeq(n--); Gives error bcz it always gives n i.e. 5 and then -- it but it recursively gives 5
        conceptSeq(--n);
    }

    static int sum = 0; // taken a value outside function to count recursions
    static int rev(int n){
        if(n==0){
            return 0;
        }
        sum = sum*10 + n%10;
        rev(n/10);
        return sum;
    }

    // sometime we need a variable or function for help
    static int rev1(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n, digits);
    }

    static int helper(int n, int arg){
        if(n%10==n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10, arg-1)) + helper(n/10, arg-1);
    }

    static boolean palin(int n){
        if(n<0){
            return false;
        }
        return rev1(n)==n;
    }

    static int count = 0;
    static int countZero(int n){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        countZero(n/10);
        return count;
    }

    static int countArgZero(int n){
        return helperCount(n, 0);
    }

    static int helperCount(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helperCount(n/10, c+1);
        }
        return helperCount(n/10, c);

    }

    public static void main(String[] args) {
        
// simple recursion
    // for n to 1
        rec(5);
        System.out.println();
    // for 1 to n
        recRev(5);
        System.out.println();
    // for both
        recBoth(5);
        System.out.println();

// factorial of number
        System.out.println(fact(5));
        System.out.println();
// sum of n number
        System.out.println(sum(23));
        System.out.println();

// sum of digits
        System.out.println(digitSum(4561278));
        System.out.println();

// Concept : n-- and --n is not same 
    // n-- give n and then -- it. so it will give problem use --n in following recursion
        conceptSeq(5);
        System.out.println();

// reverse a number
        System.out.println(rev(1234));
        System.out.println(rev1(56789));
        System.out.println();

// palindrome or not with recursion
        System.out.println(palin(1));
        System.out.println();

// count 0's in number
        System.out.println(countZero(302011004));
    // with helper function and argument the count
        System.out.println(countArgZero(305200010)); // passing same value to above fun call
        
// leetcode 1342
    }

}