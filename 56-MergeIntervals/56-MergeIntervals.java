// Last updated: 8/4/2025, 11:13:28 PM
public class Solution {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals; // No merging needed

        // Step 1: Sort intervals based on the start value (O(N log N))
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> mergedList = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) { // Overlap detected
                current[1] = Math.max(current[1], intervals[i][1]); // Merge intervals
            } else { // No overlap, add previous interval to the list
                mergedList.add(current);
                current = intervals[i];
            }
        }

        mergedList.add(current); // Add the last interval

        // Convert list to array and return
        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals2 = {{1,4},{4,5}};

        System.out.println(Arrays.deepToString(merge(intervals1))); // [[1,6],[8,10],[15,18]]
        System.out.println(Arrays.deepToString(merge(intervals2))); // [[1,5]]
    }
}
