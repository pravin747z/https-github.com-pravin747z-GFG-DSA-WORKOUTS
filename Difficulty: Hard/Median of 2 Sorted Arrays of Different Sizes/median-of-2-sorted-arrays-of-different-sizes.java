// User function Template for Java

class Solution {
    ArrayList<Integer> lst=new ArrayList<>();
    public void Sorted(int[] a,int b[]){
        int pointer1=0;
        int pointer2=0;
        int sorted=0;
        int midPoint=(a.length+b.length)/2;
        
        while(pointer1<a.length && pointer2<b.length){
            if(a[pointer1]<=b[pointer2]){
                if(sorted==midPoint-1 || sorted==midPoint){
                    lst.add(a[pointer1]);
                }
                pointer1++;
                sorted++;
            }else{
                if(sorted==midPoint-1 || sorted==midPoint){
                    lst.add(b[pointer2]);
                }
                pointer2++;
                sorted++;
            }
        }
        
        
        while(pointer1<a.length){
            if(sorted==midPoint-1 || sorted==midPoint){
                lst.add(a[pointer1]);
            }
            pointer1++;
            sorted++;
        }
        
        
        while(pointer2<b.length){
        if(sorted==midPoint || sorted==midPoint-1){
            lst.add(b[pointer2]);
        }
        sorted++;
        pointer2++;
        }
    }
    
    public double medianOf2(int a[], int b[]) {
        double sum=0;
        int len=(a.length+b.length);
        if(len==0){
            return 0;
        }
        Sorted(a,b);
        
        
        if(len%2==0 &&lst.size()==2){
            sum=lst.get(0)+lst.get(1);
            sum/=2;
        }else if(lst.size()==2){
          sum=lst.get(1);   
        }else{
            sum=lst.get(0);
        }
        
        return sum;
    }
}