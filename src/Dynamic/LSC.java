package Dynamic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LSC {
    static boolean compare(String s,String prev) {
        if(s.length()!=prev.length()+1) return false;
        int n1=s.length();
        int n2=prev.length();
        int first=0;
        int second=0;
        while(first<n1) {
            if( second<n2 && s.charAt(first)==prev.charAt(second) ) {
                first++;
                second++;
            }else {
                first++;
            }
        }
        if(first==n1 && second==n2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for(String w:words) {
            System.out.println(w);
        }
        int n=words.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,1);
        int maxi=1;
        for(int i=0;i<=n-1;i++) {
            for(int prev=0;prev<i;prev++) {
                if(compare(words[i],words[prev]) && 1+ dp[prev]>dp[i]) {
                    dp[i]=1+dp[prev];
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }

        System.out.println("Ans = "+ maxi);

    }
}
