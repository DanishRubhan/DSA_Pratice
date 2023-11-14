package String;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String str="12345*+-+";
        int f=-1;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(!(Character.isDigit(ch))) {
                f=i;
                break;
            }
        }

        int s=str.charAt(0)-'0';
        for(int i=1;i<f;i++) {
            int x=i+f-1;
            if(str.charAt(x)=='+') {
                s=s+(str.charAt(i)-'0');
            }else if(str.charAt(x)=='-') {
                s=s-(str.charAt(i)-'0');
            }else if(str.charAt(x)=='*') {
                s=s*(str.charAt(i)-'0');
            }else if(str.charAt(x)=='/') {
                s=s/(str.charAt(i)-'0');
            }
        }
        System.out.println(s);
    }
}
