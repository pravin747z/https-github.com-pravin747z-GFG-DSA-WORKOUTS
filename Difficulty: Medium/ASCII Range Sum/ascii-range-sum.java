class Solution {
    
    public ArrayList<Integer> lst=new ArrayList<>();
    public HashSet<Character> used =new HashSet<>();
    public void method(String s,char ch){
        if(used.contains(ch)){
            return;
        }
        used.add(ch);
        int len=s.length();
        int left=0;
        int right=s.length()-1;
        int sum=0;
        while(left<len-1 && s.charAt(left)!=ch){
            left++;
        }
        
        while(right>=1 && s.charAt(right)!=ch){
            right--;
        }
        
        for(int i=left+1;i<right;i++){
            sum+=(s.charAt(i)-0);
        }
        if(sum!=0){
        lst.add(sum);}
    }
    public ArrayList<Integer> asciirange(String s) {
       for(int i=0;i<s.length();i++){
           method(s,s.charAt(i));
       } 
        return lst;
    }
}