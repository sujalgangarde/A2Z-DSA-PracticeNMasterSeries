import java.util.Arrays;

public class MergeSort{

    static int[] merge(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        // This make copy or array with modified range : Arrays.copyOfRange(original Array, 1st, last);
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return merging(left, right);

    }

    static int[] merging(int[] left, int[] right){
        
        int[] merged = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                merged[k] = left[i];
                i++;
            } else{
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        // any one of array is small then remaining element of other array must add in merged
        while(i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }

    // sort in original array
    static void sortOriginal(int[] arr, int start, int end){

        if(end - start == 1){
            return;
        }

        int mid = (start + end) / 2;

        sortOriginal(arr, start, mid);
        sortOriginal(arr, mid, end);

        mergeOriginal(arr, start, mid, end);
    }

    static void mergeOriginal(int[] arr, int start, int mid,int end){

        int[] merged = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                merged[k] = arr[i];
                i++;
            } else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        // any one of array is small then remaining element of other array must add in merged
        while(i < mid){
            merged[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }


    public static void main(String[] args) {
        
// Merge Sort : divide array then sort them individually and then merge them by sorting them all
        int[] arr = {8,3,4,12,5,6,2};
    // Original array is not getting updated. new is returned.
        System.out.println(Arrays.toString(merge(arr)));
    // sorting original array
        int[] ar = {8,3,4,12,5,6,2};
        sortOriginal(ar, 0, arr.length);
        System.out.println(Arrays.toString(ar));

    }

}