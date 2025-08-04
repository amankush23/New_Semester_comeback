// Last updated: 8/4/2025, 11:11:40 PM
class Solution {
    public int FirstUniqChar(String s) {
        return firstUniqChar(s);
    }
    public static int firstUniqChar(String s) {
        int ans = -1;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i)-'a';
            arr[ind]++;
            // System.out.println(ind);
        }
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i)-'a';
            if(arr[ind] == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }

}