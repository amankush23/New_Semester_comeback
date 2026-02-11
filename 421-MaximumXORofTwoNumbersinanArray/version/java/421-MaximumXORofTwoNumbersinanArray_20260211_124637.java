// Last updated: 11/02/2026, 12:46:37
1class Solution {
2    public int findMaximumXOR(int[] arr) {
3         Trie t = new Trie();
4        for(int x: arr){
5            t.add(x);
6        }
7        int ans= 0;
8        for(int x: arr){
9            ans = Math.max(t.getMaxXor(x), ans);
10        }
11        return ans;
12    }
13      static class Trie { // Binary Tree
14
15        class Node {
16
17            Node zero;
18            Node one;
19        }
20        private Node root = new Node();
21
22        public void add(int val) {
23            Node curr = root;
24            for (int i = 31; i >= 0; i--) {
25                int bit = (val & (1 << i));
26
27                if (bit == 0) {
28                    if (curr.zero != null) {
29                        curr = curr.zero;
30                    } else {
31                        Node nn = new Node();
32                        curr.zero = nn;
33                        curr = nn;
34                    }
35                } else {
36                    if (curr.one != null) {
37                        curr = curr.one;
38                    } else {
39                        Node nn = new Node();
40                        curr.one = nn;
41                        curr = nn;
42                    }
43                }
44            }
45        }
46
47        public int getMaxXor(int x) {
48            int ans = 0;
49            Node curr = root;
50            for (int i = 31; i >= 0; i--) {
51                int bit = (x & (1 << i));
52                if (bit == 0) {
53                    if(curr.one != null) {
54                        ans = (ans | (1<<i));
55                        curr = curr.one;
56                    } else {
57                        curr = curr.zero;
58                    }
59                } else {
60                    if(curr.zero != null) {
61                        ans = (ans | (1<<i));
62                        curr = curr.zero;
63                    } else {
64                        curr = curr.one;
65                    }
66
67                }
68            }
69            return ans;
70        }
71
72    }
73
74    
75}