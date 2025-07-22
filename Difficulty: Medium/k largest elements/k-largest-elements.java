class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int len=arr.length;
        int loop=len-1;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=len-1;i>=len-k;i--){
            ans.add(arr[i]);
        }
        return ans;
    }
}
