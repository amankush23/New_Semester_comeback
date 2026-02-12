// Last updated: 12/02/2026, 23:10:25
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isEvenOddTree(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.add(root);
20        boolean evenLevel = true;
21
22        while (!q.isEmpty()) {
23            int size = q.size();
24            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
25
26            for (int i = 0; i < size; i++) {
27                TreeNode node = q.poll();
28
29                // Check parity condition
30                if (evenLevel) {
31                    if (node.val % 2 == 0 || node.val <= prev)
32                        return false;
33                } else {
34                    if (node.val % 2 == 1 || node.val >= prev)
35                        return false;
36                }
37
38                prev = node.val;
39
40                if (node.left != null) q.add(node.left);
41                if (node.right != null) q.add(node.right);
42            }
43
44            evenLevel = !evenLevel; // switch level
45        }
46
47        return true;
48    }
49}