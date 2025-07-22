class Solution {
    public int missingNumber(int[] arr) {
        int left=0;
        int right=0;
        int len=arr.length;
        Arrays.sort(arr);
        while(left<len-1 && arr[left]<=0){
            left++;
        }
        
        if(left>=len-1 && arr[left]!=1){
            return 1;
        }
        if(arr[left]!=1){
            return 1;
        }
        
        right=left;
        if(arr[0]==1){
            right=0;
        }
        
        while(right<len-1 && (arr[right+1]==arr[right] || arr[right+1]==arr[right]+1)){
            right++;
        }
        
        
        
        return arr[right]+1;
        
    }
}
