import java.math.*;

class Solution {
    boolean isBinary(String s) {
        try{
            BigInteger n=new BigInteger(s,2);
        }catch (Exception e){
            return false;
        }
        
        return true;
        
    }
}