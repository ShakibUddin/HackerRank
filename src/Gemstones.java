import java.util.ArrayList;
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
            for(int j=1;j<n;++j){
                for(int k=0;k<stones.get(j).length();++k){
                    if(stones.get(j).charAt(k)==firstStone.charAt(i)){
                        StringBuilder s=new StringBuilder();
                        s.append(stones.get(j));
                        s.setCharAt(k,'*');
                        stones.set(j,s.toString());
                        ++occurrence;
                        break;
                    }
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