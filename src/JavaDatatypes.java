import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args){
        int n;
        long a ;
        String input="",bt="byte",sh="short",in="int",ln="long";
        Scanner sc = new Scanner((System.in));
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            try{
                a=sc.nextLong();
                if(a<=127 && a>=-128){
                    System.out.println(a+" can be fitted in:");
                    System.out.println("* "+bt);
                    System.out.println("* "+sh);
                    System.out.println("* "+in);
                    System.out.println("* "+ln);
                }
                else if(a<=32767 && a>=-32768){
                    System.out.println(a+" can be fitted in:");
                    System.out.println("* "+sh);
                    System.out.println("* "+in);
                    System.out.println("* "+ln);
                }
                else if(a<=2147483647 && a>=-2147483648){
                    System.out.println(a+" can be fitted in:");
                    System.out.println("* "+in);
                    System.out.println("* "+ln);
                }
                else{
                    System.out.println(a+" can be fitted in:");
                    System.out.println("* "+ln);
                }
            }catch (Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
