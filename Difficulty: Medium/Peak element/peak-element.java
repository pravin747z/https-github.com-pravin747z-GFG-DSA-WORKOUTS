class Solution {
    public int peakElement(int[] arr) {
        int pointer=0;
        int len=arr.length;
        
        while(pointer<len-1 && arr[pointer+1]>arr[pointer]){
            pointer++;
        }
        
        return pointer;
    }
}