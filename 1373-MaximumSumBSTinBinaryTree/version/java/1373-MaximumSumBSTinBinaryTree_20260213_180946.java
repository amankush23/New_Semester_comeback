// Last updated: 13/02/2026, 18:09:46
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
17    int maxSum = 0;
18
19    public int maxSumBST(TreeNode root) {
20        dfs(root);
21        return maxSum;
22    }
23
24    // returns {isBST(1/0), min, max, sum}
25    private int[] dfs(TreeNode node) {
26        if (node == null)
27            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
28
29        int[] left = dfs(node.left);
30        int[] right = dfs(node.right);
31
32        // check BST condition
33        if (left[0] == 1 && right[0] == 1 &&
34            node.val > left[2] && node.val < right[1]) {
35
36            int sum = node.val + left[3] + right[3];
37            maxSum = Math.max(maxSum, sum);
38
39            int min = Math.min(node.val, left[1]);
40            int max = Math.max(node.val, right[2]);
41
42            return new int[]{1, min, max, sum};
43        }
44
45        return new int[]{0, 0, 0, 0}; // not BST
46    }
47}