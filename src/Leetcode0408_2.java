/**
 * @author George
 * ��������������
 * ����һ�����������ҳ��������ȡ�
 *
 * �����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
 *
 * ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 *
 * ʾ����
 * ���������� [3,9,20,null,null,15,7]��
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * �������������� 3 ��
 */
public class Leetcode0408_2 {
    public int maxDepth(TreeNode root) {
        int length = 1 ;
        if (root == null) {
            return 0;
        }

        int leftLength =  length+maxDepth(root.left);
        int rightLength = length+maxDepth(root.right);
        return (leftLength>rightLength? leftLength:rightLength);
    }
}
