

public class Binary{

// trial-> my logic i.e. recursion

    static int search(int[] arr, int ele, int start, int end){

        int middle = Math.abs((start+end)/2);

        if(arr[middle]==ele){
            // System.out.println("found at:"+middle);
            return middle;
        } else{
            if(end>start){
                // System.out.println("Not found");
                return -1;
            }else if(middle<ele){
                start = middle+1;
                search(arr, ele, start, end);
            } else if (middle>ele) {
                end = middle-1;
                search(arr, ele, start, end);
            }
        }
        return -1;

    }

// KK - Binary Seach

    static int kksearch(int[] arr, int ele){
        int start = 0;
        int end = arr.length;

        while(start<=end){
            //int mid = (start+end)/2; // there can be big arrays so (start+end) can be very large index it might be exceed int limit
            int mid = start + (end-start)/2; // better way 
            if(ele == arr[mid]){
                return mid;
            } else if(ele<arr[mid]){
                end = mid-1;
            }else if (ele>arr[mid]) {
                start = mid+1;
            } 
        }
        return -1;
    }

// for desending order

    static int desearch(int[] arr, int ele){
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(ele == arr[mid]){
                // System.out.println("Found at: "+mid);
                return mid;
            } else if(ele<arr[mid]){
                start = mid+1;
            } else if (ele>arr[mid]) {
                end = mid-1;
            } else {
                // System.out.println("Not Found");
                return -1;
            }
        }
        return -1;
    }

// agnostic binary

    static void agnostic(int[] arr, int ele){
        int start = 0;
        int end = arr.length-1;
        if (arr[start]<arr[end]) {
            int ans = kksearch(arr, ele);
            System.out.println("element at:"+ans);
        }
        if(arr[start]>arr[end]){
            int ans = desearch(arr, ele);
            System.out.println("element at: "+ans);
        }
    }

    public static void main(String[] args) {
     
// Binary Search: O(log2 N)
    // array 'must be SORTED'
    // take middle ele -> check with it if equal return index if not move to right if ele > middle or move to left if ele < middle -> repaet until found or not found

//trial
        int[] arr = {1,2,3,4,5,6,7,8};
        int ele = 5, start = 0, end = arr.length;

        // search(arr, ele, start, end);
        int index = search(arr, ele, start, end);
        System.out.println("At: "+index);

// KK - Binary search

        int[] ar = {-10,-2,0,1,2,3,4,5,6,7,8};
        int elem = -2;
        int ans = kksearch(ar, elem);
        System.out.println("index: "+ans);

// for decending order

        int a[] = {10,7,5,3,1,-1,-3};
        int e = 11;
        int ind = desearch(a, e);
        System.out.println("present at:"+ind);

// order-agnostic binary search : here we dont know arr is asending or desending

        int[] arra = {10,7,5,3,1,-1,-3};
        int element = 5;
        agnostic(arra, element);

    }

}