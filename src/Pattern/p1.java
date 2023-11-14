package Pattern;

public class p1 {
    public static void main(String[] args) {
       // pattern(5);
        //pattern5(5);
        //pattern28(5);
        //pattern30(5);
        pattern31(5);
    }
    static void pattern31(int n) {
        int originalN=n;
        n=2*n-1;
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++) {
                int number=originalN-Math.min(Math.min(row-1,col-1),Math.min(n-row,n-col));
                System.out.print(number+" ");
            }
            System.out.println();
        }

    }



    static  void pattern30(int n) {
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
        for(int row=1;row<=n;row++) {
            int spaces=n-row;
            for(int s=1;s<=spaces;s++) {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--) {
                System.out.print(col);
            }
            for(int col=2;col<=row;col++) {
                System.out.print(col);
            }
            System.out.println();
        }



    }


    static void pattern28(int n) {
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
        for(int row=1;row<=n*2-1;row++) {
            int totalCol=0;
            if(row>n) {
                totalCol=n-(row-n);
            }else{
                totalCol=row;
            }

            int spaces=n-totalCol;
            for(int s=1;s<=spaces;s++) {
                System.out.print(" ");
            }


            for(int col=1;col<=totalCol;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }




    static void pattern5(int n) {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        //    ****
        //    ***
        //    **
        //    *
       for(int row=1;row<=n*2-1;row++) {
           int totalCol = 0;
           if(row>n) {
                totalCol=n-(row-n);
           }else {
               totalCol=row;
           }
           for(int col=1;col<=totalCol;col++) {
               System.out.print("*");
           }
           System.out.println();
       }

    }



    static void pattern(int n) {
        for(int row=1;row<=n;row++) {
            for(int col=n;col>=row;col--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
