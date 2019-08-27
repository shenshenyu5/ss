import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author George
 * 此题是查找两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class Leetcode0409_2 {
    /**
     * 自己写的，代码比较垃圾，执行用时30ms击败了10.46%的用户
     * 内存消耗38.7mb，提交中击败了0.8%的用户
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        /*
            通过set去重
         */
        Set<Integer> one = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    one.add(nums1[i]);
                }
            }
        }
        int[] result = new int[one.size()];
        Iterator iterator = one.iterator();
        for (int i = 0; i < one.size(); i++) {
            while (iterator.hasNext()) {
                result[i] = (int)iterator.next();
                break;
            }
        }
        return result;
    }

    /**
     * leetcode上的解法
     * @param nums1
     * @param nums2
     * @return
     */
//    public int[] intersection1(int[] nums1, int[] nums2) {
//
//    }

    public static void main(String[] args) {
        Leetcode0409_2 leetcode0409_2 = new Leetcode0409_2();
        System.out.println(leetcode0409_2.intersection(new int[]{4, 5, 6}, new int[]{5, 6}));
    }
}
