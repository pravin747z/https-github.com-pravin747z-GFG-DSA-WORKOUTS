// User function Template for Java

class Solution {
    
    public int GCD(int a,int b){
        if(b==0){
            return a;
        }
        
        return GCD(b,a%b);
        
    }
    
    public int gcd(int n, int arr[]) {
        if(n<2){
            return arr[0];
        }
        
        
        int ans=GCD(arr[0],arr[1]);
        
        for(int i=2;i+1<arr.length;i+=2){
            int temp=GCD(arr[i],arr[i+1]);
            
            ans=GCD(ans,temp);
        }
        
        int len=arr.length;
        
        if(len%2!=0){
            int temp=GCD(arr[len-2],arr[len-1]);
            
            ans=GCD(ans,temp);
        }
        
        
        return ans;
    }
}