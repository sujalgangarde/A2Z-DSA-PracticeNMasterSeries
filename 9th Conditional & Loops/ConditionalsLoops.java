import java.util.Scanner;

public class ConditionalsLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // If - Else Loop

//        int a = 101;
//        if (a==200){
//            a = a+100;
//        }else if (a%2!=0){
//            a = a-50;
//        }else{
//            a=0;
//        }
//        System.out.println("a="+a);

        // For Loop

//        int n = sc.nextInt();
//        for(int i = 0 ; i < n; i++){
//            System.out.println(i+1);
//        }

        // While Loop

//        int n = sc.nextInt();
//        int i = 0;
//        while(i<n){
//            System.out.println(i+1);
//            i++;
//        }

        // Do-While Loop

//        int n = sc.nextInt();
//        int i = 0;
//        do{
//            System.out.println(i+1);
//            i++;
//        } while (i<n);



        // find largest of 3 numbers?

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        // Math.max(a, b); --->> give maximum number -->> Math.max(a, Math.max(b,c));
//        int max = a;
//        if (max<b){
//            max=b;
//        }else if (max<c){
//            max=c;
//        }else{
//            max=a;
//        }
//        System.out.println(max);


        // Printing Characters in String

//        String s = sc.next();
//        System.out.println(s); // gives input string
        // but if input is as '   hello   ' i.e with spaces... to remove/trim spaces
//        String str = sc.next().trim();
//        System.out.println(str);
        // but if we want only n'th letter of given string then we need eg. 0th
//        System.out.println(str.charAt(0));


        // lower or upper

//        char c = sc.next().trim().charAt(0);
//        char c = sc.next().charAt(0);
//        if(c>='a' && c<='z'){
//            System.out.println("lowercase");
//        }else{
//            System.out.println("uppercase");
//        }


        // Q. Fibonacci series

//        int n =sc.nextInt();
//        int a = 0;
//        int b = 1;
//        for(int i=0;i<n;i++){
//            System.out.println(a);
//            int temp = a;
//            a = b;
//            b = temp + b;
//        }


        // Q. to get n'th fibo number - use while loop and then print

//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <=n){
//            int temp = a;
//            a = b;
//            b = temp + b;
//            count++;
//        }
//        System.out.println(a);


        // Q. find number of occurrence eg. num of 7 in n = 16727407367
    // Sol -->> 1.divide number by 10 which gives the last digit of number then check it with given number. if same then count++. if not nothing.
    //          and then remove that digit by overwriting number as num = num/10 i.e number after dividing 10 which is number without last digit.

//        int number = 282892098;
//        int n = sc.nextInt();
//        int count = 0;
//        while (number > 0){
//            if (number % 10 == n){
//                count++;
//            }
//            number = number / 10;
//        }
//        System.out.println(count);


        // Q. make given number reverse
    // Sol : simply like above logic get only the last digit by '%' and reduce number by overwriting it. and use sout without 'ln'.

//        int num = 26819;
//        while (num > 0){
//            System.out.print(num%10);
//            num = num/10;
//        }

        // OR to get appropriate reverse number without overriding

//        int num = 6789;
//        int ans = 0;
//        while (num > 0){
//            int r = num % 10;
//            num  /= 10;
//            ans = ans * 10 + r;
//        }
//        System.out.println(ans);


        // Q. Calculator Program
    // taking input from user till user does not press 'X' or 'x'.(its like an esc)

//        int ans = 0;
//        while(true){
//            System.out.println("Enter operation's operator");
//            char op = sc.next().trim().charAt(0); // taking operation
//            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                // i/p two numbers
//                System.out.println("Enter two number");
//                int num1 = sc.nextInt();
//                int num2 = sc.nextInt();
//                System.out.println();
//
//                if(op == '+'){
//                    ans = num1+num2;
//                }
//                if(op == '-'){
//                    ans = num1-num2;
//                }
//                if(op == '*'){
//                    ans = num1*num2;
//                }
//                if(op == '/'){
//                    if(num2 != 0){
//                        ans = num1/num2;
//                    }else{
//                        System.out.println("dividing by zero error");
//                    }
//                }
//                if(op == '%'){
//                    ans = num1%num2;
//                }
//            }else if (op == 'x' || op =='X'){
//                break;
//            }else{
//                System.out.println("Invalid Operation");
//            }
//            System.out.println("Answer is: "+ans);
//        }


    }
}