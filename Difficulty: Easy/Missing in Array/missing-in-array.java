class Solution {
    int missingNum(int arr[]) {
        long sum=0;
        long max=arr[0];
        for(int i:arr){
            sum+=i;
            if(i>max){
                max=i;
            }
        }
        
        long  ans=max*(max+1)/2-(sum);
        if(ans==0){
            return (int)(max+1);
        }
        
        return (int)ans;
        
    }
}