// Last updated: 21/01/2026, 11:56:19
class Solution {
    public int minimumChairs(String s) {
          int chair = 0;
        int enter = 0;
       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                enter++;
            } else {
                enter--;
            }
            if (enter > chair) {
                chair++;
            }
        }


        return chair;
    }
}