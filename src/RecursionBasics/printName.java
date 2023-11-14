package RecursionBasics;

public class printName {
    static void print(String name,int times) {
        if(times==1) {
            return;
        }
        System.out.println(name);
        print(name,times-1);

    }
    public static void main(String[] args) {
//        Print name N times using recursion:
        String name="Danish";
        int times=5;
        print(name,times);

    }
}
