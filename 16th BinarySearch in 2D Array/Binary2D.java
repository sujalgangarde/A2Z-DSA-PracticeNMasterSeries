import java.util.*;

public class Binary2D{

    static int[] search(int[][] matrix, int ele){
        int r=0, c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==ele){
                return new int[] {r,c};
            }
            if(matrix[r][c]<ele){
                r++;
            } else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
// strictly sorted matrix
    // search in row provided between column
    static int[] binary(int[][] arr, int row, int cstart, int cend, int ele){
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(arr[row][mid]==ele){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<ele){
                cstart = mid+1;
            } else{
                cend = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] strictsort(int[][] arr, int ele){
// take middle column perform binary on it -> if middle of middle is greater than target -> ignore rows after it -> if middle of middle is lesser -> ignore above rows.
// bounds : rowstart & rowend , middle
// if in any eg. 2 rows remain then check in middle column -> consider 4 parts(notes) -> apply binary search on each 4 part

        int row = arr.length;
        int col = arr[0].length; //caution : arr may be empty

        if(col == 0){
            return new int[] {-1,-1};
        }
        if(row == 1){
            return binary(arr, 0, 0, col-1, ele);
        }
        int rstart = 0, rend = row-1, cmid = col/2;
        while(rstart < (rend-1)){
            int mid = rstart+(rend-rstart)/2;
            if(arr[mid][cmid]==ele){
                return new int[] {mid,cmid};
            }
            if(arr[mid][cmid]<ele){
                rstart = mid;
            } else{
                rend = mid;
            }
        }
        
        // now we've 2 rows -> check it
        if(arr[rstart][cmid]==ele){
            return new int[] {rstart,cmid};
        }
        if(arr[rstart+1][cmid]==ele){
            return new int[]{rstart+1,cmid};
        }
        
        // now check in that 4 part
        //1st
        if(ele<=arr[rstart][cmid-1]){
            return binary(arr, rstart, 0, cmid-1, ele);
        }
        //2nd
        if(ele>=arr[rstart][cmid+1] && ele <= arr[rstart][col-1]){
            return binary(arr, rstart, cmid-1, col-1, ele);
        }
        //3rd
        if(ele<=arr[rstart+1][cmid-1]){
            return binary(arr, rstart+1, 0, cmid-1, ele);
        }
        //4th
        if(ele>=arr[rstart+1][cmid+1]){
            return binary(arr, rstart+1, cmid+1, col-1, ele);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        
// 2d array i.e. matrix must be sorted row as well as column wise

        int[][] arr = {
            {10,20,30,40},
            {12,22,33,44},
            {33,34,38,50}
        };
        int ele = 38;
        int[] ar = search(arr, ele);
        System.out.println(Arrays.toString(ar));

// Q. Search in strictly sorted matrix

        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int e = 13;
        System.out.println(Arrays.toString(strictsort(a, e)));

    }

}