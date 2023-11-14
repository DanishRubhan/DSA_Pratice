package Pattern;

public class Mirror {
//    Input:n = 4
//    Output:
//              0
//             101
//            21012
//           3210123

    public static void main(String[] args) {
        int n=4;
        for(int row=0;row<n;row++) {
            for(int s=0;s<n-row-1;s++) {
                System.out.print(" ");
            }
            for(int col=row;col>=0;col--) {
                System.out.print(col);
            }
            for(int col=1;col<=row;col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
