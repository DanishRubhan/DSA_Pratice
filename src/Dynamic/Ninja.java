package Dynamic;

public class Ninja {
    public static void main(String[] args) {
        int days=3;
        int[][] points={
                {10,20,70},
                {20,50,80},
                {30,60,90}
        };
        //op - 210
        int ans=fun(days-1,3,points);
        System.out.println(ans);
    }

    static  int fun(int day,int last,int[][] points) {
        if(day==0) {
            int maxmi=0;
            for(int i=0;i<3;i++) {
                if(i!=last) {
                    maxmi=Math.max(maxmi,points[0][i]);
                }
            }
            return maxmi;
        }


        int max=0;
        for(int i=0;i<3;i++) {
            if(i!=last) {
                int point = points[day][i] + fun(day-1,i,points);
                max=Math.max(max,point);
            }
        }
        return  max;
    }

}
