// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int i:arr){
            count=freq.getOrDefault(i,0);
            freq.put(i,count+1);
        }
        for(int i:arr){
            if(freq.get(i)==1){
                return i;
            }
        }
        
        
        
        return 0;
    }
}
