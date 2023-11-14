package BinarySearch;
//Binary search time complexity - log n
//linear search -- binary search
    //1 million -- log(1 million) - 20 comparison


import java.util.HashSet;

public class binarySear {
    public static void main(String[] args) {
        int n=456;
        Integer kk=new Integer(n);
        HashSet<Integer>[] rows=new HashSet[n];
        int[] arr={1,2,3,4,5,6,7,8};
        int searchElement=7;
        //return the index
        int index=binarySearch(arr,searchElement);
        System.out.println("Index = "+index);
    }

    static int binarySearch(int[] arr,int element) {
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]==element) return mid;
            else if(element>arr[mid]) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
