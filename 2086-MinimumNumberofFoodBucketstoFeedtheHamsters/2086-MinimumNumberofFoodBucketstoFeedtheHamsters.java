// Last updated: 1/5/2026, 11:12:00 PM
1class Solution {
2    public int minimumBuckets(String n) {
3        char[] hamsters = n.toCharArray();
4
5        for (int i = 0; i < hamsters.length; i++) {
6            if (hamsters[i] == 'H') {
7
8                if (i - 1 >= 0 && hamsters[i - 1] == 'B') {
9                    continue;
10                }
11
12                if (i + 1 < hamsters.length && hamsters[i + 1] == '.') {
13                    hamsters[i + 1] = 'B';
14                } else if (i - 1 >= 0 && hamsters[i - 1] == '.') {
15                    hamsters[i - 1] = 'B';
16                } else {
17                    return -1;
18                }
19            }
20        }
21
22        int count = 0;
23        for (char c : hamsters) {
24            if (c == 'B') count++;
25        }
26
27        return count;
28    }
29}