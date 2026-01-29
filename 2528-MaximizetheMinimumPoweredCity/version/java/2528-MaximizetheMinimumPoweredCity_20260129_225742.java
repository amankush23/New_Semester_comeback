// Last updated: 29/01/2026, 22:57:42
1class Solution {
2    public long maxPower(int[] stations, int r, int k) {
3        int n = stations.length;
4        
5        long[] prefix = new long[n + 1];
6        for (int i = 0; i < n; i++) {
7            prefix[i + 1] = prefix[i] + stations[i];
8        }
9        
10        long[] power = new long[n];
11        for (int i = 0; i < n; i++) {
12            int left = Math.max(0, i - r);
13            int right = Math.min(n - 1, i + r);
14            power[i] = prefix[right + 1] - prefix[left];
15        }
16        
17        long left = 0, right = (long) 1e15;
18        
19        while (left < right) {
20            long mid = left + (right - left + 1) / 2;
21            
22            if (canAchieve(power, r, k, mid)) {
23                left = mid;
24            } else {
25                right = mid - 1;
26            }
27        }
28        
29        return left;
30    }
31    
32    private boolean canAchieve(long[] power, int r, int k, long target) {
33        int n = power.length;
34        long[] add = new long[n];
35        long currAdd = 0;
36        long used = 0;
37        
38        for (int i = 0; i < n; i++) {
39            if (i > r) {
40                currAdd -= add[i - r - 1];
41            }
42            
43            if (power[i] + currAdd < target) {
44                long need = target - power[i] - currAdd;
45                if (need > k - used) return false;
46                
47                int pos = Math.min(n - 1, i + r);
48                add[pos] += need;
49                currAdd += need;
50                used += need;
51            }
52        }
53        
54        return true;
55    }
56}