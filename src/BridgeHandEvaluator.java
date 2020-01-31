import java.util.*;

class BridgeHandEvaluator {
    public static void main(String[] args){
        ArrayList<String> cards = new ArrayList<String>();
        Hashtable<Integer,Character> suits = new Hashtable<Integer,Character>();
        String input;
        int point=0;
        int hearts=0,spades=0,clubs=0,diamonds=0,ace=0,king=0,queen=0,jack=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<13;++i){
            input=sc.next();
            if(input.charAt(0)=='A'){
                ++ace;
                point+=4;
            }
            else if(input.charAt(0)=='K'){
                ++king;
                point+=3;
            }
            else if(input.charAt(0)=='Q'){
                ++queen;
                point+=2;
            }
            else if(input.charAt(0)=='J'){
                ++jack;
                point+=1;
            }
            if(input.charAt(1)=='H'){
                ++hearts;
            }
            else if(input.charAt(1)=='S'){
                ++spades;
            }
            else if(input.charAt(1)=='C'){
                ++clubs;
            }
            else if(input.charAt(1)=='D'){
                ++diamonds;
            }
            cards.add(input);
        }
        suits.put(spades,'S');
        suits.put(clubs,'C');
        suits.put(hearts,'H');
        suits.put(diamonds,'D');
        if(hearts==2 || spades==2 || clubs==2 || diamonds==2){
            point+=1;
        }
        else if(hearts==1 || hearts==0 || spades==1 || spades==0 || clubs==1 || clubs==0 || diamonds==1 || diamonds==0){
            point+=2;
        }
        if(Collections.frequency(cards,"KS")==1 && spades==1){
            --point;
        }
        if( Collections.frequency(cards,"KH")==1 && hearts==1){
            --point;
        }
        if(Collections.frequency(cards,"KD")==1 && diamonds==1){
            --point;
        }
        if(Collections.frequency(cards,"KC")==1 && clubs==1){
            --point;
        }
        if(Collections.frequency(cards,"QH")==1 && queen<=2){
            --point;
        }
        if(Collections.frequency(cards,"QS")==1 && spades<=2){
            --point;
        }
        if(Collections.frequency(cards,"QD")==1 && diamonds<=2){
            --point;
        }
        if(Collections.frequency(cards,"QC")==1 && clubs<=2){
            --point;
        }
        if(Collections.frequency(cards,"JH")==1 && queen<=3){
            --point;
        }
        if(Collections.frequency(cards,"JS")==1 && spades<=3){
            --point;
        }
        if(Collections.frequency(cards,"JD")==1 && diamonds<=3){
            --point;
        }
        if(Collections.frequency(cards,"JC")==1 && clubs<=3){
            --point;
        }
        if(point<=16){
            System.out.println("BID NO-TRUMP");
        }
        else {
            System.out.println("BID "+suits.get(Collections.max(suits.keySet())));

        }
    }
}
//A=4.K=3.Q=2.J=1
//K-=1 if n==0
//Q-=1 if n<=1
//j-=1 if n<=2
//suit+=1 hand contains exactly 2 cards of a suit
//suit+=2 hand contains exactly 1 cards of a suit
//suit+=2 hand contains exactly 0 cards of a suit
//
//