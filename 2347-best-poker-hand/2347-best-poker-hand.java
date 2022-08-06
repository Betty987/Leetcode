class Solution {
    public String bestHand(int[] ranks, char[] suits) {
    int count[] = new int[14];//count ranks
    IntStream.of(ranks).forEach(i -> ++count[i]);//count the frequency of ranks
    int max=IntStream.of(count).max().getAsInt();//get the max from count 
    if(suits[0]==suits[1]&&suits[1]==suits[2]&&suits[2]==suits[3]&&suits[3]==suits[4]){
        return "Flush";
    }
        else if(max>=3)
            return "Three of a Kind";
        else if(max==2)
            return "Pair";
        else 
            return "High Card";
    }
}