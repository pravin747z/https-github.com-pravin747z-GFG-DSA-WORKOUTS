class Solution {
    int thirdLargest(int arr[]) {
      Arrays.sort(arr);
      if(arr.length<3){
          return -1;
      }
        
        return arr[arr.length-3];
    }
}