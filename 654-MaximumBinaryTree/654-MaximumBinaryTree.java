// Last updated: 8/18/2025, 10:39:02 PM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return MaximumBST(nums, 0, nums.length-1);
    }
    public TreeNode MaximumBST(int[] arr, int si , int ei){
        if(si>ei){
            return null;
        }
        int max = si;
        for(int i = si ; i <= ei; i++){
            if(arr[i] > arr[max]){
                max = i;

            }
        }
        TreeNode nn = new TreeNode(arr[max]);
        
        nn.left = MaximumBST(arr, si, max-1);
        nn.right = MaximumBST(arr, max+1, ei);
        return nn;
    }
}