/**
 * @author George
 * 翻转一个二叉树
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class LeetCode0408_1 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = null;
        //如果这个二叉树是空的话，返回一个null
        if (root == null) {
            return null;
        }
        temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }
}
