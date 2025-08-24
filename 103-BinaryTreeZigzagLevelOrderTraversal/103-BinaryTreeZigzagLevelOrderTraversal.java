// Last updated: 8/25/2025, 12:01:14 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean level = false;
        while(q.size() > 0 ){
            int qsize = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i = 0 ; i < qsize; i++){
                TreeNode n = q.remove();
                if(n.left !=null) q.add(n.left);
                if(n.right != null) q.add(n.right);
                ans.add(n.val);

            }
            if(level){
                Collections.reverse(ans);
            }
            arr.add(ans);
            level =! level;

        }
        return arr;

    }
}