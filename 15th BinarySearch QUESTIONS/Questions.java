
public class Questions{

    static int ceiling(int[] arr, int a){
        int num = a;
        int start = 0;
        int end = arr.length;
        for(int i=start; i<end; i++){
            int mid = start + (end-start)/2;
            if(arr[mid]==a){
                num = mid;
            } else if(arr[mid]<a){
                start = mid+1;
                num = start;
            } else if(arr[mid]>a){
                end = mid-1;
                num = mid; // may be the ans
            }
        }
        return arr[num];
    }

    static int ceilingkk(int[] arr, int ele){

        if(ele>arr[arr.length-1]){
            return arr[arr.length-1];
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2; 
            if(ele == arr[mid]){
                return arr[mid];
            } else if(ele<arr[mid]){
                end = mid-1;
            }else if (ele>arr[mid]) {
                start = mid+1;
            } 
        }
        return arr[0];
    }

    static int floor(int[] arr, int a){
        int num = a;
        int start = 0;
        int end = arr.length;
        for(int i=start; i<end; i++){
            int mid = start + (end-start)/2;
            if(arr[mid]==a){
                num = mid;
            } else if(arr[mid]<a){
                start = mid+1;
                num = mid;
            } else if(arr[mid]>a){
                end = mid-1;
                num = end;
            }
        }
        return arr[num];
    }


    static int floorkk(int[] arr, int ele){

        if(ele<arr[0]){
            return arr[0];
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2; 
            if(ele == arr[mid]){
                return arr[mid];
            } else if(ele<arr[mid]){
                end = mid-1;
            }else if (ele>arr[mid]) {
                start = mid+1;
            } 
        }
        return arr[end];
    }

    static int ans(int[] arr, int ele){
        // find range of chunck
        // 1st range of 2
        int start = 0;
        int end = 1;

        // condition to target lie in range
        while(ele>arr[end]){
            int newstart = end+1;
            // double size : end = pre_end + boxsize*2
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return biSearch(arr, ele, start, end);
    }

    static int biSearch(int[] arr, int ele, int start, int end){
        while(start<=end){
            //int mid = (start+end)/2; // there can be big arrays so (start+end) can be very large index it might be exceed int limit
            int mid = start + (end-start)/2; // better way 
            if(ele<arr[mid]){
                end = mid-1;
            }else if (ele>arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            } else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[mid]<=arr[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
// Ceiling of a number : smallest element in array greater or equal to target number

        int[] arr = {2,3,5,9,14,15,17};
        int target = 14;
        // System.out.println(ceiling(arr, target));
        System.out.println(ceilingkk(arr, target));

// floor of a number : greatest number smaller or equal to target

        target = 14;
        // System.out.println(floor(arr, target));
        System.out.println(floorkk(arr, target));

// find element in sorted infinite array : to understand this assume that {} array is infinite 
    // means we can't use length function. Ans :- Search in chunks of particula size
    // so we have to find start, end for these chunks and check target lies in between
    // also optimize finding start and end. (log n)
    // Answer : her we will go bottom up means increasing the arr/chunck size by doubling it in ever pass and check whether target lies in between or not. and then apply binary search for index

        int[] num = {2,3,4,5,6,7,8,12,13,16,20,23};
        int a = 5;
        System.out.println(ans(num, a));

// leetcode 1095
// leetcode 33

// Find count of how many time an array is rotated : index of pivot + 1
        int[] att = {4,5,6,1,2,3};
        System.out.println("Count: "+countRotation(att));

// leetcode 410

    }

}