package Array;

import java.util.HashMap;

//Input:
//        N = 3
//        A[] = {1,2,3}
//        Output:
//        -1
//        Explanation:
//        Since, each element in
//        {1,2,3} appears only once so there
//        is no majority element.
public class majorityElement {
    public static void main(String[] args) {
        int[] a={1,1,2,2};
        int ans=solution(a);
        System.out.println(ans);
    }

    static int solution(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();


        for(int n:arr) {
            if(hs.containsKey(n)) {
                int count=hs.get(n)+1;
                if(count>arr.length/2) {
                    return n;
                }else {
                    hs.put(n,count);
                }
            }else {
                hs.put(n,1);
            }
        }
        return  -1;
    }
}
