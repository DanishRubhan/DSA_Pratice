package BinarySearch;

public class CountZeros {
    static int count(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==0 && (mid==0 || arr[mid-1]==1)) {
                return arr.length-mid;
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0};

        int ans=count(arr);
        System.out.println("Ans =" + ans);
    }
}
