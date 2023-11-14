package Recursion;

public class subsumequaltok {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int target=2;
        sumequaltoK(arr,"",target);
    }

    static void sumequaltoK(int[] arr,String p ,int target) {
        if(target==0) {
            System.out.println(p);
            return;
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=target) {
                sumequaltoK(arr, p + arr[i], target - arr[i]);
            }
        }

    }
}
