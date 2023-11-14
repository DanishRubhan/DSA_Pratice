package Array;

public class Arraysortandrotate {
    static boolean solution(int[] arr) {
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
            System.out.println(arr[(i+1)%n]);
            if(arr[i]>arr[(i+1)%n]) {
                k++;
            }
            if(k>1) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(solution(arr));
    }
}
