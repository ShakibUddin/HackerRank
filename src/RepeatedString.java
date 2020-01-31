import java.util.Scanner;

//not solved

public class RepeatedString {
    public static void main(String[] args){
        String line="";
        long n=0,noOfa=0,remainingCharacters=0,ans=0;
        double noOfFullLines;
        Scanner sc = new Scanner(System.in);
        line=sc.nextLine();
        n=sc.nextLong();
        if(n>line.length()){
            for(int i=0;i<line.length();++i){
                if(line.charAt(i)=='a'){
                    ++noOfa;
                }
            }
            noOfFullLines=Math.floor(n/line.length());
            ans+=(long)noOfFullLines*noOfa;
            remainingCharacters=(long)(n%noOfFullLines);
            for (int i=0;i<remainingCharacters;++i){
                if(line.charAt(i)=='a'){
                    ++ans;
                }
            }
        }
        else{
            for(int i=0;i<n;++i){
                if(line.charAt(i)=='a'){
                    ++ans;
                }
            }
        }
        System.out.println(ans);
    }
}
