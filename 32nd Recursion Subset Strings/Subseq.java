
import java.util.ArrayList;

public class Subseq {
    
    static void subSequence(String str, String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        subSequence(str.substring(1), ans+ch);
        subSequence(str.substring(1), ans);
    }

    static ArrayList<String> subSeqarrList(String str, String ans){


        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        
        ArrayList<String> left = subSeqarrList(str.substring(1), ans+ch);
        ArrayList<String> right = subSeqarrList(str.substring(1), ans);
        
        left.addAll(right);
        
        return left;
    }

    static void subSeqAscii(String str, String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        subSeqAscii(str.substring(1), ans+ch);
        subSeqAscii(str.substring(1), ans);
        subSeqAscii(str.substring(1), ans+(ch+0));
    }

    static ArrayList<String> subSeqAsciiarrList(String str, String ans){


        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        
        ArrayList<String> left = subSeqAsciiarrList(str.substring(1), ans+ch);
        ArrayList<String> right = subSeqAsciiarrList(str.substring(1), ans);
        ArrayList<String> right1 = subSeqAsciiarrList(str.substring(1), ans+(ch+0));
        
        // insert both in one (left)
        left.addAll(right);
        left.addAll(right1);
        
        return left;
    }

    public static void main(String[] args) {
        
// Subset : <= collection of elements in parent... order can not change
// RECURSION & ITERATIONS
// Q. give all subset of given string
    // for 'abc' => ans = ["", "a", "b", "c", "ab", "bc", "ac", "abc"] (ca == ac) = true  so no need and in sets order is strict
    // comman pattern of subset : taking some element and removing some
        
        String str = "abc";
        subSequence(str, "");
        System.out.println(subSeqarrList(str, ""));
        
// Q. give subset of string and with char's ascii value 
    // get Ascii value
        char ch = 'a';
        System.out.println(ch+0);
    // Answer :
    subSeqAscii(str, "");
    System.out.println(subSeqAsciiarrList(str, ""));


    }

}
