import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        List<int[]> events = new ArrayList<>();
        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], 1});
            events.add(new int[]{interval[1] + 1, -1});
        }

        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                if (a[1] == 1 && b[1] == -1) {
                    return -1;
                } else if (a[1] == -1 && b[1] == 1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        int currentOverlap = 0;
        int maxPowerful = -1;
        int prevCoord = -1;

        for (int[] event : events) {
            int currentCoord = event[0];
            int type = event[1];

            if (currentCoord > prevCoord && prevCoord != -1) {
                if (currentOverlap >= k) {
                    maxPowerful = Math.max(maxPowerful, currentCoord - 1);
                }
            }
            
            currentOverlap += type;

            prevCoord = currentCoord;
        }

        return maxPowerful;
    }
}