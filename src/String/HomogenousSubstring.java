package String;

public class HomogenousSubstring {
    static int countHomogenous(String s) {
        int ans=0;
        int count=0;
        int mod=(int)1e9+7;
        for(int i=0;i<s.length();i++) {
            if(i==0 || s.charAt(i)==s.charAt(i-1)) {
                count++;
            }else {
                count=1;
            }
            ans=(ans+count)%mod;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s="zzzzz";
        System.out.println(countHomogenous(s));
    }
}
