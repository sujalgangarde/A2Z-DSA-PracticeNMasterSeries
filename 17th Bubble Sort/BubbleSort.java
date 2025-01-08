
import java.util.Arrays;


public class BubbleSort{

    //mylogic :
    static int[] bubble(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    //bubbleLogic
    static void sort(int[] arr){
        Boolean swapped; // declared to check for any pass j swaps any one of the value if not then array is sorted.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            // to make code efficient
            // if j didn't swap for any pass/i then array sorted -> no need to sort further
            if(!swapped){ // !false = true
                break;
            }          
        }
    }

    public static void main(String[] args) {
        
// BubbleSort : compare adjcent elements -> swap -> increment -> until last and it is pass one -> now with 1st pass largest is at end -> at 2nd pass 2nd largest element is at its position -> recur until sorted or till arr.length
    // Space complexity : O(1) -> constant -> no extra space required like copy vagara inplace sorting
    // time complexity : best - O(N) sorted, worst - O(N^2) sorted in opposite
    // stable sorting algo : if there are same values to sort then it will sort based on there inital order

    //mylogic :    
        int[] arr = {4,3,5,1,0,33};
        System.out.println(Arrays.toString(bubble(arr)));

    //bubbleLogic :
        // outer loop : 0 to n-1, inner loop : 1 to n-i
        int[] arr1 = {3,1,5,4,2};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}