// Last updated: 06/02/2026, 00:21:05
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        int n = nums.length;
4        if (n <= 1) return 0;
5
6        long[] arr = new long[n];
7        for (int i = 0; i < n; ++i) arr[i] = nums[i];
8        boolean[] removed = new boolean[n];
9
10        PriorityQueue<P> pq = new PriorityQueue<>(new Comparator<P>() {
11            public int compare(P a, P b) {
12                if (a.sum < b.sum) return -1;
13                if (a.sum > b.sum) return 1;
14                return Integer.compare(a.idx, b.idx);
15            }
16        });
17
18        int sorted = 0;
19        for (int i = 1; i < n; ++i) {
20            pq.add(new P(arr[i - 1] + arr[i], i - 1));
21            if (arr[i] >= arr[i - 1]) sorted++;
22        }
23        if (sorted == n - 1) return 0;
24
25        int rem = n;
26        int[] prev = new int[n];
27        int[] next = new int[n];
28        for (int i = 0; i < n; ++i) {
29            prev[i] = i - 1;
30            next[i] = i + 1;
31        }
32
33        while (rem > 1) {
34            P top = pq.poll();
35            if (top == null) break;
36            long sum = top.sum;
37            int left = top.idx;
38            int right = next[left];
39            if (right >= n || removed[left] || removed[right] || arr[left] + arr[right] != sum)
40                continue;
41
42            int pre = prev[left];
43            int nxt = next[right];
44
45            if (arr[left] <= arr[right]) sorted--;
46            if (pre != -1 && arr[pre] <= arr[left]) sorted--;
47            if (nxt != n && arr[right] <= arr[nxt]) sorted--;
48
49            arr[left] += arr[right];
50            removed[right] = true;
51            rem--;
52
53            if (pre != -1) {
54                pq.add(new P(arr[pre] + arr[left], pre));
55                if (arr[pre] <= arr[left]) sorted++;
56            } else {
57                prev[left] = -1;
58            }
59
60            if (nxt != n) {
61                prev[nxt] = left;
62                next[left] = nxt;
63                pq.add(new P(arr[left] + arr[nxt], left));
64                if (arr[left] <= arr[nxt]) sorted++;
65            } else {
66                next[left] = n;
67            }
68
69            if (sorted == rem - 1)
70                return n - rem;
71        }
72        return n;
73    }
74
75        private static class P {
76        long sum;
77        int idx;
78        P(long s, int i) {
79            sum = s;
80            idx = i;
81        }
82    }
83
84}
85