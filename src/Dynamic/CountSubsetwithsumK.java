package Dynamic;

public class CountSubsetwithsumK {
    public static void main(String[] args) {
        int[] arr={9,7,0,3,9,8,6,5,7,6};
        int n=arr.length;
        int sum=31;
        System.out.println(f(n-1,arr,sum));
    }

    static int f(int index,int[] arr,int sum) {
        if(sum==0) {
            return 1;
        }
        if(index==0) {
            return arr[index]==sum?1:0;
        }

       int notPick=f(index-1,arr,sum);
        int pick=0;
        if(arr[index]<=sum) {
            pick=f(index-1,arr,sum-arr[index]);
        }

        return notPick+pick;
    }
}
