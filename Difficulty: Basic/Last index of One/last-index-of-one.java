// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int pointer=s.length()-1;
        
        while(pointer>0 && s.charAt(pointer)!='1'){
            pointer--;
        }
        
        if(s.charAt(pointer)=='1'){
            return pointer;
        }
        
        
        return -1;
    }
}