/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        int pointer=0;
        
        while(pointer<a.length-1 && pointer<b.length-1 &&a[pointer]==b[pointer]){
            pointer++;
            
            
        }
        if(a[pointer]==b[pointer]){
            pointer++;
        }
        
        return pointer;
    }
}