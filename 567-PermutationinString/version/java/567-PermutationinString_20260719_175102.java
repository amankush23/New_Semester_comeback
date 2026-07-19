// Last updated: 19/07/2026, 17:51:02
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length()) {
4            return false;
5        }
6        int[] count1 = new int[26];
7        int[] count2= new int[26];
8        for (int i = 0; i < s1.length(); i++) {
9            count1[s1.charAt(i) - 'a']++;
10            count2[s2.charAt(i) - 'a']++;
11        }
12        if(Arrays.equals(count1, count2)) return true;
13        for (int ch =s1.length(); ch < s2.length() ; ch++) {
14            count2[s2.charAt(ch) - 'a']++;
15            //[index]++;
16            count2[s2.charAt(ch - s1.length()) - 'a']--;
17            if(Arrays.equals(count1, count2)) return true;
18        }
19        return false;
20    }
21
22}
23