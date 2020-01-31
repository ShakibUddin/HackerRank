import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Gemstones {
    public static void main(String[] args){
        int n=0,occurrence=1,ans=0;String stone,firstStone="";
        boolean gemstone=false;
        ArrayList<String> stones = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            stone=sc.next();
            stones.add(stone);
        }
        firstStone=stones.get(0);
        for(int i=0;i<firstStone.length();++i){
            CharSequence chsq = String.valueOf(firstStone.charAt(i));
            for(int j=1;j<n;++j){
                if(stones.get(j).contains(chsq)){
                    ++occurrence;
                }
                if(occurrence==n){
                    gemstone=true;
                    break;
                }
            }
            if(gemstone){
                ++ans;
                gemstone=false;
            }
            occurrence=1;
        }
        System.out.println(ans);
    }
}