// Last updated: 12/02/2026, 12:33:38
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3        int[][] q = new int [queries.length][3];
4       
5       
6        int[] ans =new int[queries.length];
7        for(int i = 0;i < q.length; i++){
8            q[i][0] = queries[i][0]; //xi
9            q[i][1] = queries[i][1]; //mi
10            q[i][2] = i; //i
11        }
12         Arrays.sort(q, (a,b) -> (a[1]-b[1]));
13 Arrays.sort(arr);
14        Trie t = new Trie();
15        int j = 0; //index
16        for(int[] a : q){
17            while(j < arr.length && arr[j]<= a[1]){
18                t.add(arr[j]);
19                j++;
20            }
21            if(j == 0){
22                ans[a[2]] = -1;
23            }
24            else{
25                ans[a[2]] = t.getMaxXor(a[0]);
26            }
27            
28        }
29
30        return ans;
31    }
32
33    static class Trie { // Binary Tree
34
35        class Node {
36
37            Node zero;
38            Node one;
39        }
40
41        private Node root = new Node();
42
43        public void add(int val) {
44            Node curr = root;
45            for (int i = 31; i >= 0; i--) {
46                int bit = (val & (1 << i));
47
48                if (bit == 0) {
49                    if (curr.zero != null) {
50                        curr = curr.zero;
51                    } else {
52                        Node nn = new Node();
53                        curr.zero = nn;
54                        curr = nn;
55                    }
56                } else {
57                    if (curr.one != null) {
58                        curr = curr.one;
59                    } else {
60                        Node nn = new Node();
61                        curr.one = nn;
62                        curr = nn;
63                    }
64                }
65            }
66        }
67
68        public int getMaxXor(int x) {
69            int ans = 0;
70            Node curr = root;
71            for (int i = 31; i >= 0; i--) {
72                int bit = (x & (1 << i));
73                if (bit == 0) {
74                    if (curr.one != null) {
75                        ans = (ans | (1 << i));
76                        curr = curr.one;
77                    } else {
78                        curr = curr.zero;
79                    }
80                } else {
81                    if (curr.zero != null) {
82                        ans = (ans | (1 << i));
83                        curr = curr.zero;
84                    } else {
85                        curr = curr.one;
86                    }
87
88                }
89            }
90            return ans;
91        }
92
93    }
94
95}