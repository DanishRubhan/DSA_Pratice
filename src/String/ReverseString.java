package String;

//S = i.like.this.program.very.much
//        Output: much.very.program.this.like.i
//        Explanation: After reversing the whole
//        string(not individual words), the input
//        string becomes
//        much.very.program.this.like.i
public class ReverseString {
    static String reverse(String S) {
        //using recursion
        if(S.isEmpty()) return S;
        int lastIndex=S.lastIndexOf(" ");
        if(lastIndex==-1) {
            return S;
        }
        String lastWord=S.substring(lastIndex+1);
        String remain=S.substring(0,lastIndex);
        return lastWord +" " +reverse(remain);

    }

    public static void main(String[] args) {
        String S="I love India";
        String ans=reverse(S);
        System.out.println(ans);
    }
}
