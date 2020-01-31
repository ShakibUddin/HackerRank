import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//not solved

public class Equal {
    public static void main(String[] args){
        int t,n,x,numOfPeople,increment=0;
        int[] chocolate = new int[]{1,2,5};
        ArrayList<Integer> people = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            int step=0;
            numOfPeople=sc.nextInt();
            for(int j=0;j<numOfPeople;++j){
                x=sc.nextInt();
                people.add(x);
            }
            int target = Collections.max(people);
            while(true){
                boolean flag=false;
                ArrayList<Integer> chocolateRequired = new ArrayList<Integer>();
                for(int k=0;k<numOfPeople;++k){
                    if(people.get(k)!=target){
                        chocolateRequired.add(target-people.get(k));
                    }
                }
                System.out.println("Chocolate required "+chocolateRequired);
                for(int k=0;k<3;++k){
                    if(Collections.min(chocolateRequired)==chocolate[k]){
                        increment=chocolate[k];
                        flag=true;
                        break;
                    }
                    else if(Collections.min(chocolateRequired)<chocolate[k]){
                        increment=chocolate[k-1];
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    increment=5;
                }
                System.out.println("increment is "+increment);
                for(int k=0;k<numOfPeople;++k){
                    if(people.get(k)!=target){
                        people.set(k,people.get(k)+increment);
                    }
                }
                System.out.println("Updated people is "+people);
                ++step;
                System.out.println("number of steps "+step);
                if(Collections.frequency(people,target)==numOfPeople){
                    System.out.println(step);
                    people.clear();
                    chocolateRequired.clear();
                    break;
                }
            }
        }

    }
}
