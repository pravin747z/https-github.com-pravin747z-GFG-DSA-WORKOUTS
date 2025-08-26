class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int pointer=0;
        
        for(int i=0;i<s2.length();i++){
            char curr=s2.charAt(i);
            char s=s1.charAt(pointer);
            if(curr==s){
                pointer++;
            }
            
            if(pointer>=s1.length()){
                break;
            }
            
            
        }
        
        
        return pointer>=s1.length();
    }
}