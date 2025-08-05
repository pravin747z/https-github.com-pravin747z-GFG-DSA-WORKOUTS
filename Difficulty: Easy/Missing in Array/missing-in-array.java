class Solution {
    int missingNum(int arr[]) {
        long max=arr[0];
        long sum=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
            sum+=i;
        }
        long maths=(max*(max+1))/2;
        if(maths-sum==0){
            return (int)max+1;
        }
        return (int)(maths-sum);
        
    }
}