import java.util.ArrayList;

public class Code{

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeOptimal(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void isPrimeOptimized(boolean[] arr, int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(!arr[i]){
                for(int j=i*2; j<=n; j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }

    static double squareRoot(int n, int p){
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            } else if(mid*mid>n){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

    static double newtonSqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)==1){
                break;
            }
            x = root;
        }
        return root;
    }

    static void factorSimp(int n){
        
        // for(int i=1; i<=n; i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }

    static void factorSqrt(int n){
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                } else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    // both time & space O(sqrt n)
    static void factorSqrtSorted(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                } else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        
// Prime No.
    // Normally use for-loop
        System.out.println(isPrime(13)); // O(n)
    // Optimized-logic : if any two integers less than given number multiplication is equal to given number then it is not a prime number. while checking repeated checks are done. to remove it just check till squrt of number
        System.out.println(isPrimeOptimal(13)); // O(root n)
    // 'sieve of eratosthenes' -  More Optimal : if a prime is found then remove its multiple i.e no need to check. also check till 'squrt' same as above. 
        int n = 40; // Q. find all prime till n
        boolean[] prime = new boolean[n+1]; // Space : O(n) , Time : O(n*log(log n))
        isPrimeOptimized(prime, n);
        System.out.println();

// Square root of Number
        int precegene = 3;
        System.out.println(squareRoot(n, precegene)); //Time : O(log n)
        System.out.printf("%.3f",squareRoot(n, precegene)); // Pretty Print
        System.out.println();
    // Newton Raphson sqrt Method : (x+n/x)/2  .. x = guess(assume) nearest to sqrt
        // working : if guess is correct sqrt then it simply return by canceling all out
        /* Steps : 1. assign x to n
                   2. check error = |root - x| is error<1
                   3. update value of x = root */
        // Time : O((log n) f(n)) ..f(n)=cost of calculating f(x)/f'(x) with p-digit precegene
        //* System.out.println(newtonSqrt(4));

// Factors of a Number : number which divides a number with remainder 0
    // Simply use for loop till n or n/2 and return factors with n
        factorSimp(20);
        System.out.println();
    // Optimal : check till sqrt of n
        factorSqrt(20); // this give unsorted
        System.out.println();
        factorSqrtSorted(20); // gives sorted
        System.out.println();

/*
Modulo properties :
        (a + b) % m = ((a % m) + (b % m)) % m
        (a - b) % m = ((a % m) - (b % m) + m) % m
        (a * b) % m = ((a % m) * (b % m)) % m
        (a / b) % m = ((a % m) * ((b^-1) % m) % m
            (b^-1) % m => multiplicative modulo inverse (MMI)
            here, b and m are co-prime(no comman factors except 1)
        (a % m) % m = a % m
        (m^x) % m = 0 ..x is +ve int

        eg. (6 * y) % 7 = 1
            y = MMI for 6 & y = 6
            (6 * 6) % 7 = 36 % 7 = 1
        
        Extra : if p is prime no which is not divisor of b, then ab^(p-1) % p = a % p ..fermat's little theorem
*/

// GCD/HCF & LCM : Theory => Notes
    //GCD / HCF
        System.out.println("GCD: "+gcd(16, 6));
    //LCM
        System.out.println("LCM: "+lcm(3, 5));

// Formula : LCM(a, b) = (a * b) / HCF(a, b)


    }

}