// Last updated: 21/01/2026, 12:00:46
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int min_Val=intervals[0][1];
        int cnt=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<min_Val)
            {
                cnt++;
            }
            else
            {
                min_Val=intervals[i][1];
            }
        }
        return cnt;
        
    }
}