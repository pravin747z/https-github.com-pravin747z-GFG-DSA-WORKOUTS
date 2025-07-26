class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        ArrayList<Integer> lst=new ArrayList<>();
        int len=arr.length;
        int left=0,right=0;
        Arrays.sort(arr);
        while(left<len){
            int curr=arr[left];
            right=left;
            while(right<len-1 && curr==arr[right+1]){
                right++;
            }
            if(right-left+1>(len/3)){
                lst.add(curr);
            }
            left=right+1;
        }
        
        return lst;
    }
}