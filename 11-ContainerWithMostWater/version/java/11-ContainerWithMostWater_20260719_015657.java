// Last updated: 19/07/2026, 01:56:57
1class Solution {
2    public int maxArea(int[] heights) {
3        int n = heights.length;
4        int i = 0;
5        int j = n-1;
6        int maxheight = 0;
7        while(i < j){
8            int width = j-i;
9            int h = Math.min(heights[i], heights[j]);
10            int area = h * width;
11            maxheight = Math.max(area, maxheight);
12            if(heights[i] > heights[j]) j--;
13            else i++;
14        }
15        return maxheight;
16    }
17}
18