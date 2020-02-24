import java.util.Scanner;

public class SavethePrisoner {
    public static void main(String[] args){
        int t,n,m,s;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            n=sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();
            if(m<=(n-s+1)){
                System.out.println((s+m-1));
            }
            else{
                m-=(n-s+1);
                if(m>n){
                    m%=n;
                    if(m==0){
                        System.out.println(n);
                    }
                    else{
                        System.out.println(m);
                    }
                }
                else{
                    System.out.println(m);
                }
            }
        }
    }
}
