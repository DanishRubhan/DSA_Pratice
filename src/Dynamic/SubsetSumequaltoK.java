package Dynamic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubsetSumequaltoK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=4;
        System.out.println(solution(arr.length-1,k,arr));
    }
    static boolean solution(int index,int target,int[] arr) {
        if(target==0) return true;
        if(index==0 ) return(arr[0]==target);

        boolean notTake=solution(index-1,target,arr);
        boolean take=false;
        if(target>=arr[index]) {
            take=solution(index-1,target-arr[index],arr);
        }

        return notTake || take;
    }
}
