package Array;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 1, 2, 1};
        TreeSet<Integer> ts=new TreeSet<>();
        for(int n:arr) {
            ts.add(n);
        }
        List<Integer> ls=new ArrayList<>(ts);
        boolean allEqual = arr.length == 1 || Arrays.stream(arr).allMatch(t -> t == arr[0]);
        System.out.println(allEqual);
        if(allEqual) {
            System.out.println(-1);
        }else {

            System.out.println("Second Largest = " + ls.get(ls.size() - 2));
        }
    }
}
