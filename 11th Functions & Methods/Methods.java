
import java.util.Scanner;


public class Methods {
// Methods : use for reuse without repeting code. just write once use multiple time.

    // static int x = 30;

//anything to call in static function without object has to be static.. 
    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a,b,sum;
    //     System.out.println("Enter two numbers :");
    //     a = sc.nextInt();
    //     b = sc.nextInt();
    //     sum = a+b;
    //     System.out.println("Sum :"+sum);
    //     sc.close();
    // }

// return type of function : it is the value which is returning or retriving from function after execution/call of that function 

        // static int sum1(){
        //     Scanner sc = new Scanner(System.in);
        //     int a,b,sum;
        //     System.out.println("Enter two numbers: ");
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        //     sum = a+b;
        //     return sum;
        // }


        // static String greet(){
        //     Scanner sc = new Scanner(System.in);
        //     String gre = sc.next();
        //     return gre;
        // }

// ARGUMENTS :

        // static void sub(int a, int b){
        //     int ans = a-b;
        //     System.out.println("SUB: "+ans);
        // }

    // Changings 

        // static void swap(int a, int b){  // taking arguments-->>value as a reference 
        //     int temp = a;
        //     a = b;  //here it create new object as 'a' pointing to b's value but it does not change value of actual a in main function
        //     b = temp;
        // }

        // static void changename(String naam){ // taken arguments passed as referenced value just naam will points to the sujal
        //     naam = "Ram"; // here it will not change name sujal to ram it will create new object as ram & this problem is beacause Strings are immutable
        // }

        
        // static void changearr(int[] arra){
        //     arra[0]=40;
        // }

//SHADOWING 

        // static void fun(){
        //     System.out.println(x); // gives original
        // }

// VARIABLE LENGTH ARGUMENTS

        // static void varargs(int...a){ // it takes int/char/string array as i/p
        //     System.out.println(Arrays.toString(a));
        // }
        // static void multiple(int a, int b, String ...s){
        //     System.out.println(a);
        //     System.out.println(b);
        //     System.out.println(Arrays.toString(s));
        // }

// FUNCTION OVERLOADING :

        // static void over(int a){
        //     System.out.println(a);
        // }
        // static void over(String name){
        //     System.out.println(name);
        // }

// Q. ISPRIME

        // static boolean isprime(int a){
        //     if(a<=1){
        //         return false;
        //     }
        //     for(int i=2;i<a;i++){
        //         if(a%i==0){
        //             return false;
        //         }
        //     }
        //     return true;
        // }

// Q. ARMSTRONG

        // static boolean armstrong(int n){
        //     int r, sum = 0;
        //     int ori = n;
        //     //use while
        //     while(n>0){
        //         r = n%10;
        //         r = r*r*r;
        //         sum = sum + r;
        //         n/=10;
        //     }
        //     if(sum == ori){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // // Q. take i/p two numbers and give sum
            // int a,b,sum;
            // System.out.println("Enter two numbers :");
            // a = sc.nextInt();
            // b = sc.nextInt();
            // sum = a+b;
            // System.out.println(a+b);
            // System.out.println("Sum :"+sum);
            // sc.close();
    
            // sum();
    
            // int ans = sum1();
            // System.out.println("Sum is : "+ans);
    
            // String msg = greet();
            // System.out.println(msg);

            // sub(20,30);  // here 20,30 are parameters


            // int a = 9;
            // int b = 4;
            // swap(a,b); // passing a,b to fun 
            // System.out.println("a="+a+"b="+b);

            // String name = "sujal";
            // changename(name); // passed to method
            // System.out.println(name); // does not changed... -->> reason is also bcz naam has access only in that method
        
        // but it will not same case for array. array will change bcz it does not make new object

            // int[] arr = {1,2,3};
            // changearr(arr);
            // System.out.println(Arrays.toString(arr));


// SCOPING : SCOPE

            // int a = 10;
            // {
            //     // int a =20; // gives error cant initialize in subblock
            //     a = 20; // can modify
            //     int b = 30; // initialized in a block will remains in block
            // }
            // System.out.println(b); // gives error

            // similar for any loop if any variable initiated in loop or condition cant be access outside it but variable initiated outside it can be use in that block.

// SHADOWING :
        // it is used when variable with same name is used in nested scopes so outer variable is 'shadowed'

            // int x at class scope
            // System.out.println(x);
            // int x = 20; // reinitialized in inner block and override
            // System.out.println(x);// this will print value of overrided x of large scope
            // fun(); // this has separate scope than main function as it only getting called but main function's x doesnt access to fun() so it will take x from large scope.


// VARIABLE LENGTH ARGUMENTS
        // used when we dont know no of args

            // varargs(1,2,3,4,5);
            // multiple(22,33,"ghsd","sfhkhsdfjh"); // can also give multiple arguments with diff datatype

// FUNCTION OVERLOADING :
        // it is multiple functions with same name but different parameters (i.e no of parameters, type of parameter, etc.)

        // over(22);
        // over("sujal");

// Q. CHECK Prime or not

            // int n = sc.nextInt();
            // System.out.println(isprime(n));

// Q. check 3 digit armstrong number or not
        //Armstrong number : it is the number in which cube's of each digit in number is added and addition is same as number before
        // eg. '153' -->> 1-1, 5-125, 3-27 so add 1+125+27='153' so 153

            // int a = sc.nextInt();
            // System.out.println(armstrong(a));
        // to find armstrong number from 1 to 10000
            
            // for(int i=0; i<=10000;i++){
            //     if(armstrong(i)){
            //         System.out.println(i+" "+armstrong(i));
            //     }
            // }

            sc.close();
        }
}