// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> lst=new LinkedList<Integer>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                lst.add(i+1);
            }
        }
        
        
        return lst;
        
    }
}