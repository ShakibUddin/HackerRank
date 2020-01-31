import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args){
        int n=0,ans=0;
        String line;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            boolean match=false;
            line=sc.next();
            if(line.length()%2!=0){
                ans=-1;
                System.out.println(ans);
            }
            else {
                char[] s1 = new char[26];
                char[] s2 = new char[26];
                String substring1 = line.substring(0,line.length()/2);
                String substring2 = line.substring(line.length()/2,line.length());
                for(int j=0;j<substring1.length();++j){
                    ++s1[substring1.charAt(j)-'a'];
                }
                for(int j=0;j<substring2.length();++j){
                    ++s2[substring2.charAt(j)-'a'];
                }
                for(int j=0;j<26;++j){
                    ans+=Math.abs(s1[j]-s2[j]);
                }
                System.out.println(ans/2);
            }
            ans=0;
        }
    }
}
