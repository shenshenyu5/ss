/**
 * @author George
 * ��Ŀ������
 * ���������������������㽫�����е�һ�����ǵ���һ����ʱ��������������һЩ�ڵ����ص���
 *
 * ����Ҫ�����Ǻϲ�Ϊһ���µĶ��������ϲ��Ĺ�������������ڵ��ص�����ô�����ǵ�ֵ�����Ϊ�ڵ�ϲ������ֵ������Ϊ NULL �Ľڵ㽫ֱ����Ϊ�¶������Ľڵ㡣
 *
 * ʾ�� 1:
 *
 * ����:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * ���:
 * �ϲ������:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 */
public class Leetcode0408 {
    public TreeNode mergeTree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
            //�Ⱥϲ����ڵ�
            t1.val += t2.val;
            //�ٵݹ�ϲ���������
            t1.left = mergeTree(t1.left, t2.left);
            t2.right = mergeTree(t1.right, t2.right);
            return t1;
            }

        }
