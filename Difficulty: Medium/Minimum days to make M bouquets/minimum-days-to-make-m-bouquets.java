class Solution {
    public boolean  isValid(int[] arr,int k,int m,int day){
        int left=0;
        int right=0;
        int count=0;
        int len=arr.length;
        
        while(left<len ){
            right=left;
            
            while(right<len &&arr[right]<=day){
                right++;
            }
            
            count+=((right-left)/k);
            
            
            
            left=right+1;
        }
        
        
        return count>=m;
        
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        int start=arr[0],mid=0,end=arr[0];
        
        if((k*m)>arr.length){
            return -1;
        }
        
        for(int i:arr){
            if(i>end){
                end=i;
            }
            if(i<start){
                start=i;
            }
        }
        
        int ans=end;
        
        mid=start+(end-start)/2;
        
        while(start<=end){
            if(isValid(arr,k,m,mid)){
                ans=mid;
                end=mid-1;
                mid=start+(end-start)/2;
            }else{
                start=mid+1;
                mid=start+(end-start)/2;
            }
        }
        
        
        return ans;
        
    }
}