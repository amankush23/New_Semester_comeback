// Last updated: 26/01/2026, 11:57:14
1class Solution {
2  public int[][] insert(int[][] intervals, int[] newInterval) {
3    int n = intervals.length;
4    List<int[]> ll = new ArrayList<>();
5    int i = 0;
6    while( i  < n && intervals[i][1] < newInterval[0]){
7        ll.add(intervals[i++]);
8    }
9    while(i < n && intervals[i][0] <= newInterval[1]){
10        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
11        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
12        i++;
13    }
14    ll.add(newInterval);
15    while( i < n ) ll.add(intervals[i++]);
16    return ll.toArray(int[][]:: new);
17  }
18}