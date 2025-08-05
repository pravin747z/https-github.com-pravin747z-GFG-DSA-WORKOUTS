/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        int rev=0;
        int num=0;
        for (int i:arr){
            num=i;
            rev=0;
            while(num!=0){
                rev+=(num%10);
                rev*=10;
                num/=10;
            }
            rev/=10;
            if(rev!=i){
                return false;
            }
            
            
        }
        
        
        return true;
    }
}