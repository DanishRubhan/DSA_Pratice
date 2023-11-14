package Array;

import java.util.HashMap;

public class firstElement {
    public static void main(String[] args) {
        int[] arr={1, 7, 4, 3, 4, 8, 7};
        int n=7;
        int k=2;
        int ans=firstElementKTime(arr,n,k);
        System.out.println(ans);
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:a) {
            if(hs.containsKey(num)) {
                hs.put(num,hs.get(num)+1);
                if(hs.get(num)==k) {
                    return num;
                }
            }else {
                hs.put(num,1);
                if(k==1) {
                    return num;
                }
            }
        }
        return -1;
    }

}
