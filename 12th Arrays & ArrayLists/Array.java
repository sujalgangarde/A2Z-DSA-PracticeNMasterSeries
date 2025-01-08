import java.util.Scanner;

public class Array{

// pscsing array to function

    // static void change(int[] arr){
    //     arr[0]=29;
    // }

// Q. max in array

        // static int max(int[] arr){
        //         int large = 0;
        //         for (int i=0; i<arr.length; i++){
        //                 if(arr[i]>large){
        //                         large = arr[i];
        //                 }
        //         }
        //         return large;
        // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

// Array : collection of same datatype
// Array Syntax :
// datatype[] variable = new datatype[size]; -->> declaration & initialization

        // int[] arr = new int[5];
        // System.out.println(arr[2]);
        // arr[2] = 22;
        // System.out.println(arr[2]);

        // for (int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

// passing array to function

        // int[] num = {1,2,4,5,2}; // num points to that {array}
        // change(num); // it does not create new copy of object so its mutable
        // System.out.println(Arrays.toString(num)); // changed

// Multidimentional array : array of arrays

    // 2D
        /*
            1 2 3
            4 5 6
         */

        // int[][] arr = new int[2][3]; // size of row = mandetorry, size of column = not mandetory
        
        // int[][] arr2d = {
        //     {1, 22, 3}, //0th index
        //     {34, 56}, 
        //     {1,3,4,5,6}, // arr2d[2]-->> {1,2,3,4,5,6} || arr2d[2][3]-->> 4
        // };
// i/p
        //int[][] arr = new int[2][3];

        // System.out.println(arr.length);

        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         arr[row][col] = sc.nextInt();
        //     }
        // }

        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
// OR
        // for(int row=0; row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
// for-each loop
        // for (int[] row : arr){
        //     for(int col : row){
        //         col = sc.nextInt();
        //     }
        // }

// ARRAYLISTS :
// it can take any no of i/p irrespective of size i.e. size not defined like array

    // Syntax : ArrayList<datatype> list_name = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(3);
        // list.add(64);
        // list.add(4);
        // list.add(648);
        // list.add(6488);
        // list.add(60);
        // list.add(sc.nextInt());
        // list.remove(2);
        // boolean a = list.contains(7667);
        // System.out.println(a);
        // System.out.println(list);

// MultiDimentional ArrayList

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // for(int i=0; i<3; i++){
        //         list.add(new ArrayList<>());  // why this : to get list we have to create it first
        // }
        // for(int i=0; i<3; i++){
        //         for(int j=0; j<3; j++){
        //                 list.get(i).add(sc.nextInt());
        //         }
        // }
        // System.out.println(list);

// Q. Give max from array.

        // int[] arr = {1,5,3,2,22,4,6,64};
        // System.out.println(max(arr));
        
// Q. Reverse array

        // int[] a= {1,2,3,4,5};
        // // reverse(a);  OR
        // rever(a);
        // System.out.println(Arrays.toString(a));




    }


        // static void rever(int[] arr){
        //         int start = 0, end = arr.length-1;
        //         while(start<end){
        //                 swap(arr, start, end);
        //                 start++;
        //                 end--;
        //         }
        // }
        // static void swap(int[] arr, int i, int j){
        //         int temp = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        // }


//     static void reverse(int[] arr){
//         int n = arr.length;
//         for(int i=0;i<n; i++){
//                 for(int j=n-1; j>=0; j--){
//                         int temp = arr[i];
//                         arr[i]=arr[j];
//                         arr[j]=temp;
//                 }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
}