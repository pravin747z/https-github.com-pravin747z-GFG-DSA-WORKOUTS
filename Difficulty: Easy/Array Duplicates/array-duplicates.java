class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> lst=new ArrayList<>();
        Arrays.sort(arr);
        int left=0,len=arr.length,right=len-1,num=0;
        
        while(left<len){
            num=arr[left];
            right=left;
            while(right<len-1 &&num==arr[right+1]){
                right++;
            }
            if(right-left+1>=2){
                lst.add(num);
            }
            left=right+1;
        }
        
        return lst;
    }
}