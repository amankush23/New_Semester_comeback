// Last updated: 8/4/2025, 11:11:22 PM
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return 0;

//         }
//         int ld = diameterOfBinaryTree(root.left);
//         int rd = diameterOfBinaryTree(root.right);
//         int sd = ht(root.left)+ht(root.right)+2;
//         return Math.max(sd, Math.max(rd, ld));

//     }
//     public int ht(TreeNode root){
//         if(root == null){
//             return -1;
//         }
//         int lh = ht(root.left);
//         int rh = ht(root.right);
//         return Math.max(lh,rh)+1;
//     }
// }


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
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return 0;

//         }
//         int ld = diameterOfBinaryTree(root.left);
//         int rd = diameterOfBinaryTree(root.right);
//         int sd = ht(root.left)+ht(root.right)+2;
//         return Math.max(sd, Math.max(rd, ld));

//     }
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {  // <-- Constructor added
        this.val = val;
    }
}

class DiaPair {
    int dt = 0;
    int ht = -1;
}

public class Solution {

    public int ht(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int lh = ht(root.left);
        int rh = ht(root.right);
        return Math.max(lh, rh) + 1;
    }

    public DiaPair diameter(TreeNode root) {
        if (root == null) {
            return new DiaPair();
        }

        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);

        int sd = ldp.ht + rdp.ht + 2;
        DiaPair sdp = new DiaPair();

        sdp.dt = Math.max(sd, Math.max(ldp.dt, rdp.dt));
        sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

        return sdp;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }
}

