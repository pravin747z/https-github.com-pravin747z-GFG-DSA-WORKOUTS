// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        Arrays.sort(arr);
        int left=0,len=arr.length,right=0;
        int num=0;
        while(left<len){
            num=arr[left];
            while(right<len-1 && arr[right+1]==num){
                right++;
            }
            
            if((right-left+1)%2!=0){
                return num;
            }
            left=right+1;
        }
        
        
        return 999;
        
    }
}