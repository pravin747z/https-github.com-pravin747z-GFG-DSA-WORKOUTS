class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        ArrayList<Integer> LST=new ArrayList<>();
        
        for(int i:arr){
            if(!LST.contains(i)){
                LST.add(i);
            }
        }
        
        return LST;
        
    }
}