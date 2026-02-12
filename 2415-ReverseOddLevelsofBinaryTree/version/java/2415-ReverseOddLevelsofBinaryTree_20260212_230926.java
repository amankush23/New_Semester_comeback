// Last updated: 12/02/2026, 23:09:26
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        dfs(root.left, root.right, 1);
19        return root;
20    }
21
22    private void dfs(TreeNode left, TreeNode right, int level) {
23        if (left == null) return;
24
25        // If level is odd → swap values
26        if (level % 2 == 1) {
27            int temp = left.val;
28            left.val = right.val;
29            right.val = temp;
30        }
31
32        // Mirror traversal
33        dfs(left.left, right.right, level + 1);
34        dfs(left.right, right.left, level + 1);
35    }
36}