package Array;

public class RemoveDuplicates {
    static void solution(int[] arr) {
        int n=arr.length;
        int index=1;
        for(int i=1;i<n;i++) {
            if(arr[i]!=arr[i-1]) {
                arr[index++]=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,3,3};
        solution(arr);
        System.out.println(arr.length);
        for(int n:arr) {
            System.out.print(n+" ");
        }
    }
}
