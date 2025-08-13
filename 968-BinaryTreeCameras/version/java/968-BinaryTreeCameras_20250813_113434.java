// Last updated: 8/13/2025, 11:34:34 AM
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
    
    public int minCameraCover(TreeNode root) {
        int c = minCamera(root);
        if(c == -1){
            Camera++;
        }
        return Camera;
    }
    int Camera=0;
        public int minCamera(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = minCamera(root.left);
            int right = minCamera(root.right);
            if(left ==-1 || right == -1){ //is node pr camera ki need hai
                Camera++;
                return 1; //camera setup kra h is node pr
            }
            if(left ==1 || right ==1){ //inme se kisi ek ke pas ya dono ke pas or ek ke pas camera hai and doosara wala covered hai
                return 0; //iska matlb  mei covered hu
            }
            else{
                return -1; // need a camera
            }
        }
}