// Last updated: 21/01/2026, 12:00:42
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        PreOrder(root, sb);
        return sb.toString();
    }

    private void PreOrder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        PreOrder(root.left, sb);
        PreOrder(root.right, sb);
    }

    // Global index for deserialization
    private int idx = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        String[] arr = data.split(",");
        idx = 0; // reset index before parsing
        return parse(arr);
    }

    private TreeNode parse(String[] arr) {
        if (idx >= arr.length) {
            return null;
        }
        String s = arr[idx++];
        if (s.equals("null")) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.parseInt(s));
            node.left = parse(arr);
            node.right = parse(arr);
            return node;
        }
    }
}

// Usage:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
