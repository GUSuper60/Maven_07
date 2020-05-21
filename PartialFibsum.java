import java.util.Scanner;

public class PartialFibsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        int [] remSeries={0,1,1,2,3,5,8,3,1,4,5,9,4,3,7,0,7,7,4,1,5
                ,6,1,7,8,5,3,8,1,9,0,9,9,8,7,5,2,7,9,6,5,1,6,7,
                3,0,3,3,6,9,5,4,9,3,2,5,7,2,9,1};

        // the sum of remSeries is 280 which gives unit place as 0.
        //so it is not necessary to add the unit places of the rem series for a/60 times

        a=a%60;
        b=b%60;

        //by formula S(n) = Fib(n+2)-1;

        int sum_a= remSeries[( (a-1) +2)%60] - 1;// because we need
        if(sum_a<0) sum_a+=10;                     //to include this term
        //System.out.println(sum_a);

        int sum_b= remSeries[(b+2)%60] - 1;
        if(sum_b<0) sum_b+=10;
        //System.out.println(sum_b);

        int ans= sum_b - sum_a;   //we are performing sun upto b minus sum upto a
        if(ans<0) ans+=10;

        System.out.println(ans);
    }
}
