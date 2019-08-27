import java.util.HashMap;
import java.util.Map;

/**
 * @author George
 * Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 */
public class Leetcode0417_1 {
    /**
     * 解题思路，定义一个变量value存储
     * 当字符串只有一个字符时，返回的是1-26
     * 所有value的初始值是0，
     * 根据字符串的长度进行遍历，然后根据charAt方法，看每一位的字符是什么减‘A’+1即可
     * 算法相对而言是比较垃圾的
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
//        int len = s.length();
//        int value = 0 ;
//        for (int i = 0; i <len; i++) {
//            value = value*26+(s.charAt(i)-'A'+1);
//        }
//        return value;
        int sum = 0;
        int len = s.length();
        for (int i=0;i<len;i++) {
            if (s.charAt(i) != '\0') {
                sum = sum * 26 + (s.charAt(i++) - 64);
            }
        }
        return sum;
    }
}
