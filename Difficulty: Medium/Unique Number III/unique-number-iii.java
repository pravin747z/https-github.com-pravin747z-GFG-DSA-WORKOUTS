//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSingle(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        Arrays.sort(arr);
        int i=0,ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int p:arr){hs.add(p);}
        for (int v:hs){
            int count=0;
            for (i=0;i<arr.length;i++){
                if(v==arr[i]){count++;}
                if(count>1){break;}}
            if(count==1){return v;}}
            return 10;
        }
}