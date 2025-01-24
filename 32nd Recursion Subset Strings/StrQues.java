
public class StrQues{

    static String changeStr(String str){
        if(str.isEmpty()){
            return "";
        }
        
        char ch = str.charAt(0);

        if(ch=='a'){
            return changeStr(str.substring(1));
        } else {
            return ch + changeStr(str.substring(1));
        }
    }

    static void changeOriginalStr(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);

        if(ch=='a'){
            changeOriginalStr(str.substring(1), ans);
        } else {
            changeOriginalStr(str.substring(1), ans+ch);
        }
    }

    static String skipStr(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.startsWith("Apple")){
            return skipStr(str.substring(5));
        } else {
            return str.charAt(0) + skipStr(str.substring(1));
        }
    }

    static void skipinOriginalStr(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        

        if(str.startsWith("Apple")){
            skipinOriginalStr(str.substring(5), ans);
        } else {
            skipinOriginalStr(str.substring(1), ans+str.charAt(0));
        }
    }

    static String skipApp(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        } else {
            return str.charAt(0) + skipApp(str.substring(1));
        }
    }

    static void skipinApp(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        

        if(str.startsWith("app") && !str.startsWith("apple")){
            skipinApp(str.substring(3), ans);
        } else {
            skipinApp(str.substring(1), ans+str.charAt(0));
        }
    }


    public static void main(String[] args) {
        
// Q. return string by removing 'a' in it
    // 1. pass ans str in arg 2. create ans str in body
        String str = "baccacd";
    // return new str
        System.out.println(changeStr(str));
    // changes original str
        changeOriginalStr(str, "");
        System.out.println();

// Q. skip entire string 'Apple'
        String a = "Sujal eats An Apple or Apple";
    // return new str
        System.out.println(skipStr(a));
    // changes original str
        skipinOriginalStr(a, "");
        System.out.println();
        
// Q. Now skip 'app' when its not 'apple' otherwise nothing
        String b = "Sujal eats An apple or app";
    // return new str
        System.out.println(skipApp(b));
    // changes original str
        skipinApp(b, "");
        System.out.println();



    }

}