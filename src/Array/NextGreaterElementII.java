package Array;

import java.util.Stack;

public class NextGreaterElementII {
    static  int[] solution(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans=solution(arr);
        for(int n:ans) {
            System.out.print(n+" ");
        }
    }
}
