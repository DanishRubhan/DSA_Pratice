package Array;

public class CircularSum {
    public static int maxSubarraySumCircular(int[] nums) {
        int arrSum=0;
        for(int i=0;i<nums.length;i++) {
            nums[i]=-1*nums[i];
            arrSum+=nums[i];
        }

        int localSum=nums[0];
        int globalSum=localSum;
        for(int i=1;i<nums.length;i++) {
            localSum=Math.max(nums[i],localSum+nums[i]);
            globalSum=Math.max(localSum,globalSum);
        }

        return -(arrSum-globalSum);
    }

    public static void main(String[] args) {
        int[] arr={5,-3,-2,6,-1,4};
        int ans=maxSubarraySumCircular(arr);
        System.out.println(ans);
    }
}
