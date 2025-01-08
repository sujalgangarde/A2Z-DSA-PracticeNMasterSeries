
import java.util.ArrayList;
import java.util.Arrays;

public class StringsBuild {
    
// palindrome checker
    static boolean checkpalin(String str){
        str = str.toLowerCase();
        if(str==null || str.length()==0){
            return true;
        }
        
        for (int i = 0; i <= str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;

        //OR

        // int i=0, j=str.length()-1;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;


    }

    public static void main(String[] args) {
        
        String name = "Sujal Gangarde";
        System.out.println(name);

//String is a class in java -> these are immutable(can not be changed) -> stored in string pool inside heap memory
    // if more ref are pointinh to same object -> if change is happen it create new obj for that
        String a = "Sujal";
        System.out.println(a);
        a = "Gangarde"; //here only a was pointing to 'sujal' now a ref to 'Gangarde'by crating new object it cant change original one. so 'Sujal'=>garbage collection
        System.out.println(a);
        
        String b = "Ram";
        String c = "Ram";
        System.out.println(b==c); // here == checks the 'locations' of object in memory and value

    // creating different object of same value (explicitly)
        // creating string object in heap but outside of string pool
        String d = new String("Object");
        String e = new String("Object");
        System.out.println(d==e);
        System.out.println(d.equals(e)); // it just checks value
        
        System.out.println(a.charAt(2)); // String is collection of character or char array
        System.out.println(Arrays.toString(new int[] {2,3,4,1}));

        String z = new String("Kunal");
        System.out.println(z.toString());
        
    // pretty printing
        // print till 2 digit
        float x = 5467.345f;
        System.out.printf("formated %.2f", x);
        System.out.println();
        System.out.printf("%.4f", Math.PI);
        //place holders
        System.out.printf("I am %s and I am %s","Sujal", "Student"); //google it

    // operator
        System.out.println('a'+'b'); // char is converted to ascii value and add
        System.out.println("a"+"b"); // strings are concat
        System.out.println("a"+3); // str and int are concat and int called its wrapper class Integer and call toString
        System.out.println('a'+3); // char's ascii + 3rd char's ascii
        System.out.println((char)('a'+3)); // from a ascii 3rd char

        System.out.println("Sujal"+ new ArrayList<>());
        System.out.println("sujal"+ new Integer(44));

        // '+' it  is only used with primitives OR one of them should be String type. Here this operator give multiple functionalities so operator overloading

    // performance
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i); // everytime creating new object and add old to it so memory wastage. 
            System.out.println(ch);
            series+=ch;
        }
        System.out.println(series);

// String Builder

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(3);
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    
// Methods provided by Strings : str.

        String str = "Sinhgad College";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('a'));

// Q. palindrome or not

        String palin = "abcba";
        System.out.println(checkpalin(palin));
    }

}
