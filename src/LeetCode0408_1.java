/**
 * @author George
 * ��תһ��������
 * ���룺
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * �����
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
        //�������������ǿյĻ�������һ��null
        if (root == null) {
            return null;
        }
        temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }
}
