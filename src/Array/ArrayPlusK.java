package Array;

public class ArrayPlusK {
    public static void main(String[] args) {
        int[] num={2,7,4};
        int k=181;

        for(int i=num.length-1;i>=0;i--) {
            if(k==0) break;
            int last=k%10;
            int sum=last+num[i];
            int carry=sum/10;
            if(sum<9) {
                num[i]=sum;
            }else {
                num[i]=sum%10+carry;
            }
            k/=10;
        }

        for(int n:num) {
            System.out.print(n+" ");
        }
    }
}
