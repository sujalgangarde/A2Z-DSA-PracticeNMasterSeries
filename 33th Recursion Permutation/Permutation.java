
import java.util.ArrayList;

public class Permutation {

    static void permut(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String fst = p.substring(0, i);
            String scnd = p.substring(i, p.length());
            permut(fst + ch + scnd, up.substring(1));
        }
    }

    static ArrayList<String> permutList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String fst = p.substring(0, i);
            String scnd = p.substring(i, p.length());
            ans.addAll(permutList(fst + ch + scnd, up.substring(1)));
        }
        return ans;
    }

    static int permutCount(String p, String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String fst = p.substring(0, i);
            String scnd = p.substring(i, p.length());
            count = count + permutCount(fst + ch + scnd, up.substring(1));
        }
        return count;
    }
    

    public static void main(String[] args) {
        
// Permutation :
    // Nothing is ignored like subset
    // No. of Permutation = size ! (factorial)
    // '(' exclusive ')' / '[' Exclusive ']'
    // p = processed, up = unprocessed

        permut("", "abc");
        System.out.println();
        ArrayList<String> ans = permutList("", "def");
        System.out.println(ans);

    // Count : No. of Permutation = size ! (factorial)
        System.out.println("Count: "+permutCount("", "ghi"));
        

    }

}
