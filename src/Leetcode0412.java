public class Leetcode0412 {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return (root.left == null || root.left.val == root.val)
                && (root.right == null || root.right.val == root.val)
                && isUnivalTree(root.left)
                && isUnivalTree(root.right);

    }
}
