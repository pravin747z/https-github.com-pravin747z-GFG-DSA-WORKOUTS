// User function Template for Java

class Solution {
    
    public void recursion(String og,String upper,List<String> lst){
        if(og.isEmpty()){
            lst.add(upper);
            return;
        }
        recursion(og.substring(1),upper+og.charAt(0),lst);
        recursion(og.substring(1),upper,lst);
    }
    
    
    public List<String> AllPossibleStrings(String s) {
        List<String> list=new LinkedList<>();
        recursion(s,"",list);
        
        Collections.sort(list);
        
        return list;
    }
}