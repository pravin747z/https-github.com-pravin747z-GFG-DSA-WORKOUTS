class Solution {
    private int count = 0;

    public int countRevPairs(int[] arr) {
        divide(arr, 0, arr.length - 1);
        return count;
    }

    private void divide(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        sort(arr, start, mid, end);
    }

    private void sort(int[] arr, int start, int mid, int end) {
        
        int right = mid + 1;
        for (int left = start; left <= mid; left++) {
            while (right <= end && (long) arr[left] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        List<Integer> merged = new ArrayList<>();
        int left = start;
        right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                merged.add(arr[left++]);
            } else {
                merged.add(arr[right++]);
            }
        }

        while (left <= mid) {
            merged.add(arr[left++]);
        }
        while (right <= end) {
            merged.add(arr[right++]);
        }

        
        for (int i = start; i <= end; i++) {
            arr[i] = merged.get(i - start);
        }
    }
}
