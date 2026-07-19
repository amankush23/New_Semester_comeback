// Last updated: 19/07/2026, 14:30:31
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int left = 0;
4        int maxf = 0;
5        int ans = 0;
6
7        HashMap<Character, Integer> map = new HashMap<>();
8        for(int right = 0; right < s.length(); right++){
9            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
10            maxf = Math.max(maxf, map.get(s.charAt(right)));
11            while((right - left+1) - maxf > k){
12                char leftChar = s.charAt(left);
13                map.put(leftChar, map.get(leftChar)-1);
14                left++;
15            }
16            ans = Math.max(ans, right - left + 1);
17        }
18        return ans;
19    }
20}
21