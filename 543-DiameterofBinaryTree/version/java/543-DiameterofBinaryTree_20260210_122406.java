// Last updated: 10/02/2026, 12:24:06
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
17    public int diameterOfBinaryTree(TreeNode root) {
18        return diameter(root).dt;
19
20    }
21
22    public DiaPair diameter(TreeNode root) {
23        if (root == null)
24            return new DiaPair();
25        DiaPair lsd = diameter(root.left);
26        DiaPair rsd = diameter(root.right);
27        int sd = lsd.ht + rsd.ht + 2;
28        DiaPair dia = new DiaPair();
29        dia.dt = Math.max(sd, Math.max(lsd.dt, rsd.dt));
30        dia.ht = Math.max(lsd.ht, rsd.ht) + 1;
31        return dia;
32    }
33
34    class DiaPair {
35        int dt = 0;
36        int ht = -1;
37    }
38}