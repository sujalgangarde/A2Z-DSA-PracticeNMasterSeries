import java.util.Arrays;

public class InsertionSort{

    static void insert(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }else{
                        break; // no need to sort left side of array bcz already sorted
                    }
            }
        }
    }

    public static void main(String[] args) {
        
    // Insertion Sort : compare 1st 2 index and sort then 1st 3 index sort then 1st 4 index and so on until array is sorted
        // Time complexity : Best - O(N), worst - O(N^2) . Stable
        int[] arr = {3,5,2,4,1};
        insert(arr);
        System.out.println(Arrays.toString(arr));

    }

}