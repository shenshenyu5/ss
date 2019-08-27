/**
 *
 * @author George
 * ����������������BST���ĸ��ڵ��һ��ֵ�� ����Ҫ��BST���ҵ��ڵ�ֵ���ڸ���ֵ�Ľڵ㡣 �����Ըýڵ�Ϊ���������� ����ڵ㲻���ڣ��򷵻� NULL��
 *
 * ���磬
 *
 * ��������������:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * ��ֵ: 2
 * ��Ӧ�÷�����������:
 *
 *       2
 *      / \
 *     1   3
 */
public class Leetcode0416 {
    public TreeNode searchBST(TreeNode root,int val) {
        if (root == null) {
           return  null;
        }
        if (val == root.val) {
                return root;
        }
        if (root.val > val) {
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }

    }
}
