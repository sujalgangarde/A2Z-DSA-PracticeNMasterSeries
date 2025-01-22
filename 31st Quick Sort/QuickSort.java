
import java.util.Arrays;


public class QuickSort{

    static void quick(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e){

            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            // while incrementing s and e it can violet s<=e so check here and only then swap and increment.
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now pivot is at correct index now sort further two halfs
        quick(arr, low, e);
        quick(arr, s, high);

    }

    public static void main(String[] args) {
        
// Quick Sort : 
/*
What its doin :
    1. choose a pivot randomly. and after every pass greater element than pivot must be on right side and lesser element will be on left side of pivot
       so we are putting pivot at its correct position at every pass
    2. then recursivly call for left and right part for sorting and ther will be same process take any pivot and greater at its right and lesser at left and so on till sorted.

How its doin :
    how to put pivot at crt position - 
        start checking from both side start and end (start++, end--) . If violation happens at both side then just swap them. and if violation is only at one then swap with pivot bcz one of ptr start/end will be == pivot.
        when start == end it will be at pivot. so at next pass start and end will be at part of array. like low to end and start to high.
    how to pick pivot :
        basically its on us.
        i. can pick random element
        ii. can pick corner(start, end) element
        iii. can pick middle one

Recurance relation :
        total element : N
        [____]p[_____]
           k  1  N-k-1
        
        T(N) = T(k) + T(N-k-1) + O(N)
    worst case => k=0 ..like if pivot is smallest/largest element
        T(N) = T(0) + T(N-1) + O(N) = T(N-1) + O(N) = O(N^2)
    best case => k=N/2 ..like if pivot is middle element
        T(N) = T(N/2) + T(N-1) + O(N) = 2*T(N/2) + O(N)

-- Not Stable algorithm : if same element may not in previous order
-- Sorting Original only. Not taking new space.
-- better for linkedlist due to memory allocation not continous
 */

// Hybrid sorting algorithm(Tim Sort) = merge + insertion Sort

        int[] arr = {55,3,4,8,12,2,13};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    // Internal Sorting Algorithm : DualPivot Quick Sort
        int[] ar = {55,3,4,8,12,2,13};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

    }

}