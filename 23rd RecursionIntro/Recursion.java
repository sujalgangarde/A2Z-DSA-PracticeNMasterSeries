
public class Recursion{

    static void print(int n){
        System.out.println(n);
        if(n==5){
            return; // Stop at a base condition : condition where recursion stops
        } // if this is not then stack overflow error
        print(n+1); // Called itself again with diff. argument
    }

// myfibo -- error
    static int fibo(int n, int a, int b){
        int count=0;
        int num=0;
        while(count<n){
            if (n==1) {
                num = 0;
                return num;
            } else if (n==2) {
                num =  1;
                return num;
            } else {
                num = a+b;
                int temp = a;
                a=b;
                b=b+temp;
                count++;
                fibo(n, a, b);
            }
        }
        return num;
    }

// kk fibo
    static int fibokk(int n){
        if(n<2){
            return n;
        }
        return fibokk(n-1)+fibokk(n-2);
    }

// Binary search by recursion
    static int bs(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        } else if(arr[m]>target){
            return bs(arr, target, s, m-1); // must 'return' o/p of this call
        } else {
            return bs(arr, target, m+1, e);
        }
    }

    public static void main(String[] args) {
    // Normal calls for function : as fun is called it putted in stack if another fun is called from previous fun then this will execute first and after execution it will be removed from stack and then return call to privious one. Also same for more than 2 functions.
    // Recursive calls : it is similar to Normal call as it treated as separate call for that fun by diff arg
// Recursion : calling method/function by itself. Why need : helps to solve complex prob in simple way
    // recursion can convert into iteration and vice versa
    // Space complexity is not constant bcz recursive calls. call need memory
    
        // print(1);
        
// Q. fibonacci nos
        int n = 6;
        // System.out.println(fibo(n, 0, 1));
        System.out.println("fibo: "+fibokk(n));

/* To understand and approch to solve a problem
    1. identify that it can divide into smaller problem 
    2. write recurrance
    3. recursive tree
      - see fun how getting in stack
      - focus on left tree calls and then right tree call */

// *Variable in recursion : Which variable to take arg, which to operate in body, which to return
/*
        Identify all variable in function which are needed
        1. arg - identify which elements affect/want to pass in next recursion. element which should not changed in function call
        2. retutntyepe - simply depends on what u want
        3. body of function - element specific to a call eg. formula variable / element which may changes in each function according to args
    Not to overthink till prob is solved

    **If there is return type make sure to return each function call
  
*/       
        int[] arr = {1,2,4,5,6,12,14,22};
        int target = 6;
        System.out.println("Index: "+bs(arr, target, 0, arr.length-1));

    }

}