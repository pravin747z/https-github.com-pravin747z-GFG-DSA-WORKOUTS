import java.util.Arrays;

class Solution {
    public int maxSum(String s) {
        int n = s.length();
        if (n < 2) {
            return 0;
        }

        int[] d1 = new int[n];
        int l = 0, r = -1;
        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 1 : Math.min(d1[l + r - i], r - i + 1);
            while (i - k >= 0 && i + k < n && s.charAt(i - k) == s.charAt(i + k)) {
                k++;
            }
            d1[i] = k;
            if (i + k - 1 > r) {
                l = i - k + 1;
                r = i + k - 1;
            }
        }

        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            int len = 2 * d1[i] - 1;
            int startIndex = i - d1[i] + 1;
            int endIndex = i + d1[i] - 1;
            starts[startIndex] = Math.max(starts[startIndex], len);
            ends[endIndex] = Math.max(ends[endIndex], len);
        }

        for (int i = n - 2; i >= 0; i--) {
            ends[i] = Math.max(ends[i], ends[i + 1] - 2);
        }

        for (int i = 1; i < n; i++) {
            starts[i] = Math.max(starts[i], starts[i - 1] - 2);
        }

        int[] leftMax = new int[n];
        leftMax[0] = ends[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], ends[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = starts[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], starts[i]);
        }

        int maxSum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (leftMax[i] > 0 && rightMax[i + 1] > 0) {
                maxSum = Math.max(maxSum, leftMax[i] + rightMax[i + 1]);
            }
        }
        
        return maxSum;
    }
}