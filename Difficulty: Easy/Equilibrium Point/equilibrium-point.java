class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int len=arr.length;
        int[] preSum=new int[len];
        int[] postSum=new int[len];
        
        for(int i=len-2;i>=0;i--){
            postSum[i]=arr[i+1]+postSum[i+1];
        }
        
        for(int i =1;i<len;i++){
            preSum[i]=arr[i-1]+preSum[i-1];
        }
        
        for(int  i=0;i<len;i++){
            if(preSum[i]==postSum[i]){
                return i;
            }
        }
        
        return -1;
    }
}
