import javax.swing.tree.TreeNode;

public class Valid_BST {
    public boolean isValidBST(TreeNode root){
        return ValidBST(root).isbst;
    }
    public BstPair ValidBST(TreeNode root){
        if(root == null){
            return new BstPair();
        }
        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);
        BstPair sbp = new BstPair();
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max <root.val && rbp.min >root.val;
        return sbp;
    }
    class BstPair{
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isbst = true;
    }
}
