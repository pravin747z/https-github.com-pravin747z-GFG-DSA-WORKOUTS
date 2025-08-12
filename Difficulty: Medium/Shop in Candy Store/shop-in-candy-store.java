class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        ArrayList<Integer> lst=new ArrayList<>();
        int Cost=0, pointer=0, len=prices.length;
        int count=0;
        
        
        while(pointer<len && count<len){
            Cost+=prices[pointer];
            count+=1+k;
            pointer++;
        }
        
        lst.add(Cost);
        
        pointer=len-1;
        Cost=0;
        count=0;
        
        while(pointer>=0 &&count<len){
            Cost+=prices[pointer];
            count+=1+k;
            pointer--;
        }
        lst.add(Cost);
        
        return lst;
    }
}
