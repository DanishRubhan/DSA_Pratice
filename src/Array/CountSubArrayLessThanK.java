package Array;

public class CountSubArrayLessThanK {
    public static void main(String[] args) {
        int[] nums={10,5,2,6};
        int k=100;
        int left=0;
        int right=0;

        int prod=1;
        int res=0;
        while(right<nums.length) {
            prod=prod*nums[right];
            if(prod<k) {
                res++;
                right++;
            }else {
                left++;
                right=left;
                prod=1;
            }
        }

        System.out.println("ans - "+res);
    }
}
