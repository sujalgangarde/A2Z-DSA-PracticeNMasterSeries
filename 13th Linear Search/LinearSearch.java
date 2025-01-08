
public class LinearSearch{

    // static void linear(int[] arr, int ele){
    //     if(arr.length == 0){
    //         System.out.println("Not found");
    //     }

    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]==ele){
    //             System.out.println("Element found at: "+i);
    //         }
    //     }
    // }

// search in strings

    // static boolean sea(String str, char ele){
    //     if(str.length()==0){
    //         return false;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)==ele){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

// search in range

    // static int range(int[] arr, int ele, int start, int end){
    //     if(arr.length==0){
    //         return -1;
    //     }
    //     for(int i=start; i<end; i++){
    //         if(arr[i]==ele){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

// find min and max

    // static void minmax( int[] arr){
    //     int min = arr[0];
    //     int max = arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]<min){
    //             min=arr[i];
    //         }
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.println("MIN :"+min);
    //     System.out.println("MAX :"+max);
    // }

// search in 2d array

    // static boolean ar2d(int[][] arr, int ele){
    //     if(arr.length==0){
    //         return false;
    //     }
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr[i].length; j++){
    //             if(arr[i][j]==ele){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // // return index 

    // static int[] search2d(int[][] arr, int ele){
    //     if(arr.length==0){
    //         return null;
    //     }
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr[i].length; j++){
    //             if(arr[i][j]==ele){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //     return new int[] {-1,-1};
    // }

// Q. how many numbers in array contain even no of digits

    // static int evendigi(int[] arr){
    //     int count = 0;
    //     for(int i=0; i<arr.length; i++){
    //         if(even(arr[i])){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // //fun to check number even digits or not
    // static boolean even(int num){
    //     int count = 0;
    //     while(num>0){
    //         count++;
    //         num = num/10;
    //     }
    //     return count%2==0;
    // }

// Q. maxwealth problem

    // static int maxwealth(int[][] arr){
    //     int max = 0;
    //     for (int i=0; i<arr.length; i++){
    //         int wealth = 0;
    //         for (int j=0; j<arr[i].length; j++){
    //             wealth+=arr[i][j];
    //         }
    //         if(max<wealth){
    //             max = wealth;
    //         }
    //     }
    //     return max;
    // }

    public static void main(String[] args) {
        
// Simple method

        // int[] arr = {4,5,2,6,51,7412,233};
        // linear(arr,59);

// search in strings

        // String name = "Sujal";
        // char ele = 'z';
        // System.out.println(sea(name,ele));

// search in range : search ele in any particular range

        // int[] arr = {12,34,566,742,24,652,3};
        // int ele = 3, start=3, end=7;
        // System.out.println(range(arr,ele,start,end));

// find min max

        // int[] ar = {3,123,7,5,34,23,33};
        // minmax(ar); 

// search in 2d array

        // int[][] arr = {
        //     {1,2,3},{4,56}
        // };
        // int ele = 4;
        // System.out.println(ar2d(arr,ele));
        // // to return index
        // int[] ans = search2d(arr,ele);
        // System.out.println(Arrays.toString(ans));

// Q. how many numbers in array contain even no of digits

        // int[] num = {12,2,3,32,123,76};
        // System.out.println(evendigi(num));

// Q. maxwealth problem

        // int[][] arr = {
        //     {1,2,3,4},
        //     {3,4,5},
        //     {2,2}
        // };
        // int ans = maxwealth(arr);
        // System.out.println("Wealthy: "+ans);

    }
}