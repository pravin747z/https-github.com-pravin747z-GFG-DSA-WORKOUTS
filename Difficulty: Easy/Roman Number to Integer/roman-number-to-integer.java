class Solution {
    public int romanToDecimal(String s) {
        HashMap<Character,Integer> value=new HashMap<>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);
        if(s.length()==1){
            return value.get(s.charAt(0));
        }
        int sum=0;
        char ch1='a',ch2='b';
        
        for(int i=0;i<s.length()-1;i++){
            ch1=s.charAt(i);
             ch2=s.charAt(i+1);
            if(value.get(ch1)<value.get(ch2)){
                sum-=value.get(ch1);
            }else{
                sum+=value.get(ch1);
            }
        }
        sum+=value.get(s.charAt(s.length()-1));
        
        return sum;
    }
}