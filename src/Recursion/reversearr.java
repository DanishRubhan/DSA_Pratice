package Recursion;

public class reversearr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,21,10};
        int end=arr.length;
        reverse(0,end-1,arr);
        for(int n:arr) {
            System.out.print(n+" ");
        }
    }

    static void reverse(int start,int end,int[] arr) {
        if(start>=end) {
            return;
        }
        swap(start, end,arr);
        reverse(start+1,end-1,arr);
    }

    static void swap(int l,int r,int[] arr) {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

}
