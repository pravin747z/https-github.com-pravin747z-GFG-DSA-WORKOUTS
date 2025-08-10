class Solution {
    
    int count=0;
    public void parlindromebyCenter(String s , int left,int  right){
        while(left>=0 && right<s.length() &&s.charAt(left)==s.charAt(right)){
            if(right-left+1>=2){
                count++;
            }
            
            left--;
            right++;
        }

    }
        
    public int countPS(String s) {
        
        for(int i=0;i<s.length();i++){
            parlindromebyCenter(s,i,i);
            parlindromebyCenter(s,i,i+1);
        }
        
        return count;
    }
    
    
}