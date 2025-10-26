import java.util.*;

class Solution {
    public int minOperations(int[] arr) {
        int steps=0;
        Queue<Double> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        
        double sum=0;
        
        for(int i:arr){
            maxheap.add((double)i);
            sum+=i;
        }
        
        double target=sum/2;
        
        
        while(sum>target && maxheap.size()!=0){
            double prev=maxheap.poll();
            double curr=prev/2;
            sum=sum-prev+curr;
            maxheap.add(curr);
            steps++;
        }
        
        
        return steps;
        
    }
}