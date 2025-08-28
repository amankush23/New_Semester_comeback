// Last updated: 8/28/2025, 12:05:39 PM
import java.util.*;

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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<VerticalPair> q = new LinkedList<>();
        TreeMap<Integer, List<VerticalPair>> map = new TreeMap<>();

        q.add(new VerticalPair(root, 0, 0));

        while (!q.isEmpty()) {
            VerticalPair vp = q.poll();

            map.putIfAbsent(vp.v, new ArrayList<>());
            map.get(vp.v).add(vp);

            if (vp.node.left != null) {
                q.add(new VerticalPair(vp.node.left, vp.l + 1, vp.v - 1));
            }
            if (vp.node.right != null) {
                q.add(new VerticalPair(vp.node.right, vp.l + 1, vp.v + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            List<VerticalPair> ll = map.get(key);

            // Sort by row first, then value
            Collections.sort(ll, (o1, o2) -> {
                if (o1.l == o2.l) {
                    return o1.node.val - o2.node.val;
                }
                return o1.l - o2.l;
            });

            List<Integer> list = new ArrayList<>();
            for (VerticalPair v : ll) {
                list.add(v.node.val);
            }
            ans.add(list);
        }

        return ans;
    }

    class VerticalPair {
        TreeNode node;
        int l; // row
        int v; // col

        public VerticalPair(TreeNode node, int l, int v) {
            this.node = node;
            this.l = l;
            this.v = v;
        }
    }
}
