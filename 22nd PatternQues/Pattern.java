
public class Pattern{

    static void pattern1(int n){
        for (int row = 0; row <= n; row++) {
            //for every row, run each column
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            // After printing a line -> next line 
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=0; i<n; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(1+j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 0; i < 2*n; i++) {
            int c;
            if(i>n){
                c=2*n-i;
            } else{
                c=i;
            }
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 0; i < 2*n; i++) {
            int c;
            if(i>n){
                c=2*n-i;
            } else{
                c=i;
            }

            int spaces = n-c;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i = 0; i <= n; i++) {
            
            for (int s = 0; s < n-i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        n=2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int atindex = Math.min(Math.max(i, j), Math.min(n-i, n-j));
                System.out.print(atindex+" ");
            }
            System.out.println();
        }
    }

    static void Thepattern31(int n){
        int N = n;
        n=2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int atindex = N - Math.min(Math.max(i, j), Math.min(n-i, n-j));
                System.out.print(atindex+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
// assingments 9-Patterns.md Questions -

    /* General steps (Trick): 
        Every pattern is 2D. So there are rows and columns. Two loops Outer for rows and inner for columns
        1. no. of lines = no. row = no. of times outer loop run
        2. Identify for every row how many columns are there and elements in pattern. 
        3. According to pattern make conditions. What to print
    */

        int n = 8;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern28(n);
        System.out.println();
        pattern30(n);
        System.out.println();
        pattern31(4);
        System.out.println();
        Thepattern31(4);
        System.out.println();
    }

}