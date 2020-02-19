import java.util.Scanner;

public class SherlockandSquares {
    public static void main(String[] args){
        int t,a,b;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            int ans=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int j=1;j<=Math.sqrt(1000000000);++j){
                if(j*j>=a && j*j<=b){
                    ++ans;
                }
                else if(j*j>b){
                    break;
                }
            }
            System.out.println(ans);
        }

    }
}
