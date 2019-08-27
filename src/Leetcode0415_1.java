import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class Leetcode0415_1 {
    List<Integer> list = new ArrayList<>();

    /**
     * 递归方法实现前序遍历
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
     * 迭代方法实现N叉树的前序排列
     */
//    public List<Integer> preorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        if (root!=null) {
//            //借助栈的先进后出特点，反向push root的孩子节点
//            Stack<Node> stack = new Stack<>();
//            stack.push(root);
//            if (!stack.empty()) {
//                //pop()方法是将栈顶元素移除，并作为返回值
//                Node n = stack.pop();
//                list.add(Integer.valueOf(n.val));
//                List<Node> children = n.children;
//                if (children.size()>0) {
//                    //指定ListIterator
//                    ListIterator listIterator = children.listIterator(list.size());
//                    while (listIterator.hasPrevious()) {
//                        stack.push((Node)listIterator.previous());
//                    }
//                }
//            }
//        }
//    }
}
