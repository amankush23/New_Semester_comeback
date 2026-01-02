// Last updated: 1/2/2026, 4:03:22 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if (root == null) return null;
13        if (root == p || root == q) return root;
14
15        TreeNode left = lowestCommonAncestor(root.left, p, q);
16        TreeNode right = lowestCommonAncestor(root.right, p, q);
17
18        if (left != null && right != null) return root;
19        return left == null ? right : left;
20    }
21}