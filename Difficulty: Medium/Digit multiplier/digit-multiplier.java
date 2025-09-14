// User function Template for Java
import java.math.*;


class Solution {
    static BigInteger ans=new BigInteger(""+Long.MAX_VALUE);
    static boolean found=false;
    
    public static BigInteger min(BigInteger bg1,BigInteger bg2 ){
        int res=bg1.compareTo(bg2);
        
        if(res<=0){
            return bg1;
        }
        
        
        return bg2;
    }
    
    public static  void rec(Long num,String div){
        if(num==1){
            found=true;
            ans=min(ans,new BigInteger(div));
            return ;
        }
        
        boolean flag=false;
        
        for(int i=9;i>=2;i--){
            if(num%i==0){
                rec(num/i,i+div);
                break;
            }
        }
    }
    
    
    static String getSmallest(Long N) {
        if(N<=3){
            return ""+N;
        }
        ans=new BigInteger(""+Long.MAX_VALUE);
        found=false;
        
        for(int i=9;i>=2;i--){
            if(N%i==0){
                 rec(N/i,""+i);
            }
        }
        
        if(!found){
            return "-1";
        }
        
        
        
        return ans.toString();
    }
};