// Last updated: 8/4/2025, 11:09:10 PM
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int result = 0;
        result += meetings[0][0]-1;
        int last = meetings[0][1];
        for(int i = 0 ; i < meetings.length; i++){
            int start = meetings[i][0];
            int end = meetings[i][1];
            if(start > last){
                result += start - last -1;
            }
            last = Math.max(last, end);
        }
        result+=days-last;
        return result;
    }
}