// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
    
      int left=0,len=arr.length,right=len-1;
       while(left<len-1 && arr[left]!=key){
           left++;
       }
       while(right>0 && arr[right]!=key){
           right--;
       }
       if(arr[left]!=key){
           left=-1;
           right=left;
       }
       int[] ans={left,right};
       
       
       return ans;
        
    }
}