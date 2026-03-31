// Last updated: 31/03/2026, 11:20:48
1import java.util.*;
2
3class Solution {
4
5    public static void fillNeighbour(Queue<String> q, String curr, HashSet<String> set) {
6        char[] arr = curr.toCharArray();
7        for (int i = 0; i < 4; i++) {
8            char ch = arr[i];
9            char inc = (ch == '9') ? '0' : (char)(ch + 1);
10            char dec = (ch == '0') ? '9' : (char)(ch - 1);
11            arr[i] = dec;
12            String next1 = new String(arr);
13            if (!set.contains(next1)) {
14                set.add(next1);
15                q.add(next1);
16            }
17            arr[i] = inc;
18            String next2 = new String(arr);
19            if (!set.contains(next2)) {
20                set.add(next2);
21                q.add(next2);
22            }
23
24            arr[i] = ch;
25        }
26    }
27
28    public int openLock(String[] deadends, String target) {
29        HashSet<String> set = new HashSet<>();
30        for (String d : deadends) set.add(d);
31
32        String start = "0000";
33        if (set.contains(start)) return -1;
34
35        Queue<String> queue = new LinkedList<>();
36        queue.add(start);
37        set.add(start);
38        int level = 0;
39        while (!queue.isEmpty()) {
40            int n = queue.size();
41
42            while (n-- > 0) {
43                String curr = queue.poll();
44
45                if (curr.equals(target)) {
46                    return level;
47                }
48
49                fillNeighbour(queue, curr, set);
50            }
51
52            level++;
53        }
54        return -1;
55    }
56}