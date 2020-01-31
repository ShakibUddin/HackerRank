import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args){
        int n=0,lengths=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            lengths=sc.nextInt();
            sticks.add(lengths);
        }
        Collections.sort(sticks);
        while(!sticks.isEmpty()){
            System.out.println(sticks.size());
            Integer min=sticks.get(0);
            for(int i=0;i<sticks.size();++i){
                if(sticks.get(i)==min){
                    sticks.remove(i);
                    i=-1;
                }
                else{
                    sticks.set(i,sticks.get(i)-min);
                }
            }
        }

    }
}
