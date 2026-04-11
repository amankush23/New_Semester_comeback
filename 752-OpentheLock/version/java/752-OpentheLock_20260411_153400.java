// Last updated: 11/04/2026, 15:34:00
1import java.util.*;
2
3class Solution {
4    public static void fillNeighbour(Queue<String> q, String curr, HashSet<String> set) {
5        char[] arr = curr.toCharArray();
6        for (int i = 0; i < 4; i++) {
7            char ch = arr[i];
8            char inc = (ch == '9') ? '0' : (char)(ch + 1);
9            char dec = (ch == '0') ? '9' : (char)(ch - 1);
10            arr[i] = dec;
11            String next1 = new String(arr);
12            if (!set.contains(next1)) {
13                set.add(next1);
14                q.add(next1);
15            }
16            arr[i] = inc;
17            String next2 = new String(arr);
18            if (!set.contains(next2)) {
19                set.add(next2);
20                q.add(next2);
21            }
22            arr[i] = ch;
23        }
24    }
25
26    public int openLock(String[] deadends, String target) {
27        HashSet<String> set = new HashSet<>();
28        for (String d : deadends) set.add(d);
29        String start = "0000";
30        if (set.contains(start)) return -1;
31        Queue<String> queue = new LinkedList<>();
32        queue.add(start);
33        set.add(start);
34        int level = 0;
35        while (!queue.isEmpty()) {
36            int n = queue.size();
37
38            while (n-- > 0) {
39                String curr = queue.poll();
40
41                if (curr.equals(target)) {
42                    return level;
43                }
44
45                fillNeighbour(queue, curr, set);
46            }
47
48            level++;
49        }
50        return -1;
51    }
52}