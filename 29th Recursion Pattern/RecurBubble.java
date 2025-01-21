
import java.util.Arrays;

public class RecurBubble {

    static void bubbleSort(int[] arr, int l, int p){
        if(l==0){
            return;
        }
        if(p<l){
            if(arr[p]>arr[p+1]){
                //swap
                int temp = arr[p];
                arr[p] = arr[p+1];
                arr[p+1] = temp;
            }
            bubbleSort(arr, l, p+1);
        } else{
            bubbleSort(arr, l-1, 0);
        }
    }

    public static void main(String[] args) {

        int[] ar = {3,4,2,1,6,12};
        bubbleSort(ar, ar.length-1, 0);
        System.out.println(Arrays.toString(ar));

    }

}
