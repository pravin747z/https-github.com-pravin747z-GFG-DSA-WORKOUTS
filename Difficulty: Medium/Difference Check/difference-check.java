class Solution {
    
    public int calc(String s){
        int step=60*60;
        int N=0;
        for(String T:s.split(":")){
            N+=(Integer.parseInt(T)*step);
            step/=60;
        }
        
        return N;
    }
    public int minDifference(String[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        int min=99999;
        int diff=0;
        int time1=0,time2=0;
        
        for(int i=0;i<len-1;i++){
            time1=calc(arr[i]);
            time2=calc(arr[i+1]);
            diff=Math.abs(time1-time2); 
            min=Math.min(min,diff);
        }
        
        int nextDay=(24*60*60)-calc(arr[len-1])+calc(arr[0]);
        min=Math.min(min,nextDay);
        
        return min;
        
    }
}
