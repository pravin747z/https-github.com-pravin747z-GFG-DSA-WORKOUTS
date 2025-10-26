class Solution {
    public static int minCost(int[] arr) {
        int cost=0;
        int total=0;
        
        Queue<Integer> minheap=new PriorityQueue<>();
        
        for(int i:arr){
            minheap.add(i);
        }
        
        
        while(minheap.size()>1){
            int num1=minheap.poll();
            int num2=minheap.poll();
            int sum=num1+num2;
            // System.out.println(sum);
            total+=sum;
            // System.out.println("total : "+total+"\n\n\n");
            minheap.add(sum);
        }
        
        
        
        
        
        return total;
    }
}