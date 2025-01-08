import java.util.Arrays;

public class SelectionSort{

    static void sorting(int[] arr){

        for(int i=0; i<arr.length; i++){
            // find max and swap with correct index
            int last = arr.length-i-1;
            int maxind = getmax(arr, 0, last);

            swap(arr, maxind, last);
        }

    }

    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i=start+1; i<end; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int fst, int scnd){
        int temp=arr[fst];
        arr[fst]=arr[scnd];
        arr[scnd]=temp;
    }

    public static void main(String[] args) {
        
    // Selection Sort : select max/min element and swap it with its corrct index
        // time complexity : O(N^2) . it is not stable sorting algorithm
        
        int[] arr = {4,5,2,3,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));


    }

}

// find max/min from array and swap at last position if max or swap at 1st position then recur according to correct position