class Solution {
    public int minSoldiers(int[] arr, int k) {
     HashMap<Integer,List<Integer>> track=new HashMap<>();
     TreeSet<Integer> keys=new TreeSet<>();
     int len=arr.length;
     
     for(int i:arr){
         int key=k-(i%k);
         if(key==k){
             key=0;
         }
         if(keys.contains(key)){
             track.get(key).add(i);
         }
         
         else{
             List<Integer> lst=new LinkedList<Integer>();
             lst.add(i);
             track.put(key,lst);
             keys.add(key);
             
         }
     }
     
     int troops=0;
     int required=len/2;
     if(len%2!=0){
        required+=1;
     }
     
     
    
     for(int i:keys){
         if(required!=0){
        
         int curr=Math.min(required,track.get(i).size());
         required-=curr;
        troops+=(curr*i);
         }else{
             return troops;
         }
         
     }
     
     
     return troops;
    
}
}