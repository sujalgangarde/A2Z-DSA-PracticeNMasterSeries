
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetArray {
    
    static List<List<Integer>> subArr(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int j=start; j<arr.length; j++) {
            start = 0;
            // if current & previous is same then start = end + 1
            if(j > 0 && arr[j] == arr[j-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        
// Q. give subset of array
    // Iteratative : Time = O(N * 2^N)  Space = (N * 2^N)
        int[] arr = {1,2,3};
        System.out.println(subArr(arr));
    
// Q. may contain duplicate element (only for sorted)
    // if duplicate are adjecent then only add it to new created subset of previous step. 
    // if not adjecent then sort
        int[] num = {2,1,2};
        System.out.println(subDuplicate(num));
    }
}
