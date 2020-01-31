import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args){
        String line;int n,ans=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            line=sc.next();
            for(int j=0;j<line.length()-1;++j){
                if(line.charAt(j)==line.charAt(j+1)){
                    line.replace(line.charAt(j),'*');
                    ++ans;
                }
            }
            System.out.println(ans);
            ans=0;
        }
        sc.close();
    }
}