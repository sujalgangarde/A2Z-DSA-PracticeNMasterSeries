import java.util.ArrayList;
import java.util.Arrays;

public class RecursionArray{

    static boolean isSorted(int[] arr, int i){
        //logic is same
        // if(i==arr.length-1){
        //     return true;
        // } else if(arr[i]<arr[i+1]){
        //     return isSorted(arr, i+1);
        // }
        // return false;

        //kk method
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<arr[i+1] && isSorted(arr, i+1));
    }

    static boolean findEle(int[] arr, int ele, int i){
        if(i==arr.length){
            return false;
        }
        return (arr[i]==ele || findEle(arr, ele, i+1));
    }

    static int findEleInd(int[] arr, int ele, int i){
        if(i==arr.length){
            return -1;
        } else if(arr[i]==ele){
            return i;
        }
        return findEleInd(arr, ele, i+1);
    }

    static int findEleIndLast(int[] arr, int ele, int i){
        if(i==-1){
            return -1;
        } else if(arr[i]==ele){
            return i;
        }
        return findEleIndLast(arr, ele, i-1);
    }

    static int[] findEleIndfstNlast(int[] arr, int ele, int start, int end){
        return new int[] {findEleInd(arr, ele, start), findEleIndLast(arr, ele, end)};
    }

    // same as above but returns all indexs in array where element is
    static ArrayList<Integer> list = new ArrayList<>();
    static void findEleIndAll(int[] arr, int target, int i){
        if(i==arr.length){
            return;
        } else if(arr[i]==target){
            list.add(i);
        }
        findEleIndAll(arr, target, i+1);
    }

    @SuppressWarnings("unchecked") // i dont know what is this. added just bcz editor suggested :)
    // same as above but list in argument
    static ArrayList<Integer> findEleIndAllinList(int[] arr, int ele, int i, ArrayList list){
        if(i==arr.length){
            return list;
        } else if (arr[i]==ele) {
            list.add(i);
        }
        return findEleIndAllinList(arr, ele, i+1, list);
    }

    // making list inside body ..results in new list for each recursion so add it while returning
    static ArrayList<Integer> findEleIndBodyList(int[] arr, int ele, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        } else if(arr[i]==ele){
            list.add(i);
        }
        list.addAll(findEleIndBodyList(arr, ele, i+1));
        return list;
    }

    static int bsRotated(int[] arr, int ele, int start, int end){
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }

        if(arr[mid]==ele){
            return mid;
        }

        if (arr[start]<=arr[mid]) { // checks sorted
            if(ele>=arr[start] && ele<arr[mid]){ // checks element is in this range
                return bsRotated(arr, ele, start, mid-1);
            } else{
                return bsRotated(arr, ele, mid+1, end);
            }
        }
        if(ele>=arr[mid] && ele<=arr[end]){
            return bsRotated(arr, ele, mid+1, end);
        } else{
            return bsRotated(arr, ele, start, mid-1);
        }
    }


    public static void main(String[] args) {
        
// Find if array is sorted or not
        int[] arr = {1,2,17,8,9};
        System.out.println("Sorted or not: "+isSorted(arr, 0));

// find element in array
        int[] a = {3,2,13,12,13,5,13,9};
        int target = 13;
    //return boolean
        System.out.println("Is element "+target+" in array: "+findEle(a, target, 0));
    // return index
        System.out.println("Is element "+target+" in array index: "+findEleInd(a, target, 0));
    // return index from last
        System.out.println("Is element "+target+" in array index from last: "+findEleIndLast(a, target, a.length-1));
    // find both from 1st and last
        System.out.println("Is element "+target+" in array index Both from 1st and last: "+ Arrays.toString(findEleIndfstNlast(a, target, 0, a.length-1)));
    // to find all indexs of element using arraylist
        findEleIndAll(a, target, 0);
        System.out.println("Is element "+target+" in array index All: "+ list);
    // if dont want arraylist outside then give it in argument
        ArrayList <Integer> list1 = new ArrayList<>();
        findEleIndAllinList(a, target, 0, list1);
        System.out.println("Is element "+target+" in array index All with list in args: "+ list1);
    // dont put list in argument. make it in body of function : here to make list in body so complicated bcz it creates new list for each recursion
        // problem : new list creating for each recursion so list is limited for that only.
        // solution : add further list in previous one by list.add() while returning it.
        System.out.println("find "+target+"'s all indexs in list inside BodyOfFunction: "+findEleIndBodyList(a, target, 0));

// Binary Search in Rotated array with recursion
        int[] ar = {5,6,7,2,3,4};
        int element = 2;
        System.out.println("BS in rotated array with recursion: "+bsRotated(ar, element, 0, ar.length-1));

    }

}