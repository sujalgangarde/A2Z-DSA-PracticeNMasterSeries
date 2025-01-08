
public class Recursion{

    static void print(int n){
        System.out.println(n);
        if(n==5){
            return; // Stop at a base condition : condition where recursion stops
        } // if this is not then stack overflow error
        print(n+1); // Called itself again with diff. argument
    }

    public static void main(String[] args) {
    // Normal calls for function : as fun is called it putted in stack if another fun is called from previous fun then this will execute first and after execution it will be removed from stack and then return call to privious one. Also same for more than 2 functions.
    // Recursive calls : it is similar to Normal call as it treated as separate call for that fun by diff arg
// Recursion : calling method/function by itself. Why need : helps to solve complex prob in simple way
    // recursion can convert into iteration and vice versa
    // Space complexity is not constant bcz recursive calls. call need memory
    
        print(1);
        
// Q. fibonacci nos
        


    }

}