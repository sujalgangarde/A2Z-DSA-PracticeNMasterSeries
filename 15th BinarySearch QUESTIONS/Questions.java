
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

    }

}