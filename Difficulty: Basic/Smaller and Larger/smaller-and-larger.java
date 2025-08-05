// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int low=0,up=0;
        
        for(int i:arr){
            if(i<=target){
                low++;
            }if(i>=target){
                up++;
            }
        }
        
        int[] ans={low,up};
        
        return ans;
        
    }
}