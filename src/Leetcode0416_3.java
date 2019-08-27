import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * 自除数
 *
 * @author George
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 */

public class Leetcode0416_3 {
    /**
     * 本题的难度在于如何判断该数是否能被自己本省的各个位置整除
     * 此算法过程要记住
     * 先定义一个value变量，value大于0时。
     * 用while循环
     * 判断是否能被10整除 如果不能，同时此数除以该余数可以整除
     * value = value/10;
     * @param left
     * @param right
     * @return
     */
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
           if (canSub(i)){
               lists.add(i);
           }
        }
        return lists;
    }

    public static boolean canSub(int n) {
        int value = n;
        while (value>0) {
            if (value%10!=0&&n%(value%10)==0) {
                value /= 10;
            }else{
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 100));
    }
}
