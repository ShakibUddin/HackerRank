import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args){
        String s1="",s2="";
        int ans=0;
        boolean match=false;
        Scanner sc = new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        char[] s1f = new char[26];
        char[] s2f = new char[26];
        for(int i=0;i<26;++i){
            s1f[i]=0;
        }
        for(int i=0;i<26;++i){
            s2f[i]=0;
        }
        for(int i=0;i<s1.length();++i){
            ++s1f[s1.charAt(i)-'a'];
        }
        for(int i=0;i<s2.length();++i){
            ++s2f[s2.charAt(i)-'a'];
        }
        for(int i=0;i<26;++i){
           ans+=Math.abs(s1f[i]-s2f[i]);
        }
        System.out.println(ans);
    }
}
