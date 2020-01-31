import java.util.*;

//not solved

public class ClimbingTheLeaderboard {
    public static void main(String[] args){
        TreeSet<Integer> playerPos = new TreeSet<Integer>();
        ArrayList<Integer> alicePos = new ArrayList<Integer>();
        int n,m,pos=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            pos=sc.nextInt();
            if(!playerPos.contains(pos)){
                playerPos.add(pos);
            }
        }
        m=sc.nextInt();
        for(int i=0;i<m;++i){
            pos=sc.nextInt();
            alicePos.add(pos);
        }

        NavigableSet<Integer> reversePlayerPos = playerPos.descendingSet();
        for(int i=0;i<alicePos.size();++i){
            if(reversePlayerPos.contains(alicePos.get(i))){
                System.out.println(reversePlayerPos.headSet(alicePos.get(i)).size()+1);
            }
            else{
                reversePlayerPos.add(alicePos.get(i));
                System.out.println(reversePlayerPos.headSet(alicePos.get(i)).size()+1);
            }
        }
    }
}
