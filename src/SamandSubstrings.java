import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;

//Not Solved

public class SamandSubstrings {
    static TreeSet<BigInteger> sum = new TreeSet<BigInteger>();
    public static void main(String[] args){
        String line;
        Scanner sc = new Scanner(System.in);
        line=sc.nextLine();
        BigInteger zero = new BigInteger("0");
        BigInteger mod = new BigInteger("1000000007");
        sum.add(zero);
        for(int i=0;i<line.length();++i){
            for(int j=i+1;j<=line.length();++j){
                String str = line.substring(i,j);
                BigInteger value = new BigInteger(str);
                sum.add((sum.last().add(value)).mod(mod));
            }
        }
        System.out.println(sum.last());
    }
}

