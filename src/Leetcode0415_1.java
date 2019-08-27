import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * N������ǰ�����
 * ����һ�� N ������������ڵ�ֵ��ǰ�������
 *
 * ���磬����һ�� 3���� :
 *
 * ������ǰ�����: [1,3,5,6,2,4]��
 */
public class Leetcode0415_1 {
    List<Integer> list = new ArrayList<>();

    /**
     * �ݹ鷽��ʵ��ǰ�����
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        if (root != null) {
            list.add(Integer.valueOf(root.val));
            if (root.children.size()>0) {
                for (Node node :root.children) {
                    preorder(node);
                }
            }
        }
        return list;
    }

    /**
     * ��������ʵ��N������ǰ������
     */
//    public List<Integer> preorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        if (root!=null) {
//            //����ջ���Ƚ�����ص㣬����push root�ĺ��ӽڵ�
//            Stack<Node> stack = new Stack<>();
//            stack.push(root);
//            if (!stack.empty()) {
//                //pop()�����ǽ�ջ��Ԫ���Ƴ�������Ϊ����ֵ
//                Node n = stack.pop();
//                list.add(Integer.valueOf(n.val));
//                List<Node> children = n.children;
//                if (children.size()>0) {
//                    //ָ��ListIterator
//                    ListIterator listIterator = children.listIterator(list.size());
//                    while (listIterator.hasPrevious()) {
//                        stack.push((Node)listIterator.previous());
//                    }
//                }
//            }
//        }
//    }
}
