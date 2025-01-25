
import java.util.ArrayList;


public class Questions{

    static void phone(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; 

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            
            char ch = (char) ('a' + i);

            phone(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> phoneReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; 

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phoneReturn(p + ch, up.substring(1)));
        }
        return list;
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> diceReturn(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p+i, target-i));
        }
        return list;
    }

    public static void main(String[] args) {
        
// Leetcode : 17 (Google)
        phone("", "45");
        System.out.println(phoneReturn("", "23"));
    // count
        System.out.println(phoneReturn("", "23").size());
        System.out.println();

// Amazon
// Q. Dice Problem : roll dice till get sum equal to number
        dice("", 7);
        System.out.println(diceReturn("", 6));

    }
}