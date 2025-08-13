// Last updated: 8/13/2025, 10:12:40 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root;
        root = createBst(nums, 0, nums.length-1);
        return root;
    }
    public TreeNode createBst(int[] arr, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode nn = new TreeNode();
        nn.val = arr[mid];
        nn.left = createBst(arr,si, mid-1);
        nn.right = createBst(arr, mid+1, ei);
        return nn;
    }
}