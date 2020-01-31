import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,d,x,triplet=0;
        ArrayList<Integer> num = new ArrayList<Integer>();
        n=sc.nextInt();
        d=sc.nextInt();

        for(int i=0;i<n;++i){
            x=sc.nextInt();
            num.add(x);
        }
        for(int i=0;i<n-2;++i){
            for(int j=i+1;j<n-1;++j){
                if(num.get(j)-num.get(i)==d){
                    for(int k=j+1;k<n;++k){
                        if(num.get(k)-num.get(j)==d){
                            ++triplet;
                        }
                        else if(num.get(k)-num.get(j)>d){
                            break;
                        }
                    }
                }
                else if(num.get(j)-num.get(i)>d){
                    break;
                }
            }
        }
        System.out.println(triplet);
    }
}
