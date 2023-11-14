package Dynamic;

public class LIS {
    static int f(int index,int prev,int[] arr) {
        if(index==arr.length-1) return  0;

        int len=0+f(index+1,prev,arr);
        if(prev==-1 || arr[index]>arr[prev]) {
            len= Math.max(len,1+f(index+1,index,arr));
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        int n=arr.length;
        System.out.println("Ans LIS  -  "+ f(0,-1,arr));
    }
}
