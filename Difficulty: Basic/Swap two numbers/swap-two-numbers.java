class Solution {
    static List<Integer> get(int a, int b) {
        List<Integer> lst=new ArrayList<Integer>();
        
        
        a=a+b;
        b=a-b;
        a=a-b;
        lst.add(a);
        lst.add(b);
        
        return lst;
    }
}