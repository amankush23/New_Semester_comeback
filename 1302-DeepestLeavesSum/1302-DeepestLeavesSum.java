// Last updated: 8/25/2025, 12:21:52 AM
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0; // reset sum for each level

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        return sum; // last level sum
    }
}
