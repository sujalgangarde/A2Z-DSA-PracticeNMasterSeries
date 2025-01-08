
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

// kunal's fibo
    static int fibokk(int n){
        if(n<2){
            return n;
        }
        return fibokk(n-1)+fibokk(n-2);
    }

    public static void main(String[] args) {
    // Normal calls for function : as fun is called it putted in stack if another fun is called from previous fun then this will execute first and after execution it will be removed from stack and then return call to privious one. Also same for more than 2 functions.
    // Recursive calls : it is similar to Normal call as it treated as separate call for that fun by diff arg
// Recursion : calling method/function by itself. Why need : helps to solve complex prob in simple way
    // recursion can convert into iteration and vice versa
    // Space complexity is not constant bcz recursive calls. call need memory
    
        // print(1);
        
// Q. fibonacci nos
        int n = 12;
        // System.out.println(fibo(n, 0, 1));
        System.out.println(fibokk(n));

// Q. 

    }

}