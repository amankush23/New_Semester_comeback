// Last updated: 10/02/2026, 15:14:57
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return BST(nums, 0, nums.length-1);
19    }
20    public TreeNode BST(int[] nums, int si, int ei){
21        if(si > ei) return null;
22        int mid = (si+ei)/2;
23        TreeNode nn = new TreeNode();
24        nn.val = nums[mid];
25        nn.left = BST(nums, si, mid-1);
26        nn.right = BST(nums, mid+1, ei);
27        return nn;
28    }
29}