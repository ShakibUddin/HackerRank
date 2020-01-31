import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;
public class ModifiedFibonacci {
    public static void main(String[] args){
        long n,m=2L;
        BigInteger t1,t2;
        TreeSet<BigInteger> t3 = new TreeSet<BigInteger>();
        Scanner sc = new Scanner(System.in);
        t1=sc.nextBigInteger();
        t2=sc.nextBigInteger();
        n=sc.nextInt();
        while(true){
            t3.add(t1.add(t2.multiply(t2)));
            ++m;
            if(m==n){
                System.out.println(t3.last());
                break;
            }
            t1=t2;
            t2=t3.last();
        }
    }
}
