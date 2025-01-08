import java.util.Arrays;

public class CyclicSort {
    
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crtindex = arr[i]-1;
            if(arr[i]!=arr[crtindex]){
                swap(arr, i, crtindex);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }


    public static void main(String[] args) {
        
    // Cyclic Sort : 
        // when given no. or values from range 1,N -> use cyclic --->> means values to be sorted is like start from one and continous till arbitary 'n'
        // i.e index = value-1 --> wr.t. this swap elements with its correct index and again check
        // Time complexity : O(N)

        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
