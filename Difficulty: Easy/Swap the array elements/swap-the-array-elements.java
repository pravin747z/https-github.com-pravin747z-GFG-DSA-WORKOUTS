class Solution {
    public void swapElements(int[] arr) {
        int pointer=0;
        int len=arr.length;
        while(pointer+2<=len-1 ){
            int temp=arr[pointer];
            arr[pointer]=arr[pointer+2];
            arr[pointer+2]=temp;
            pointer++;
        }
        
    }
}