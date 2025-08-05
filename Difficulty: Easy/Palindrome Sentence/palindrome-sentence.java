class Solution {
    public boolean isPalinSent(String s) {
        StringBuilder temp=new StringBuilder("");
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean check1=(ch>='a' && ch<='z');
            boolean check2=(ch>='0' && ch<='9');
            
            if(check1 || check2){
                temp.append(ch);
            }
        }
        
        return temp.toString().equals(temp.reverse().toString());
        
    }
}