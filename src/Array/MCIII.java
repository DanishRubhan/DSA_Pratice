package Array;

public class MCIII {
    static int solution(int[] arr,int k) {
        int i=0,j;
        for(j=0;j<arr.length;j++) {
            if(arr[j]==0) k--;
            if(k<0 && arr[i++]==0) k++;
        }
        return j-i;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int ans=solution(arr,2);
        System.out.println(ans);
    }
}
