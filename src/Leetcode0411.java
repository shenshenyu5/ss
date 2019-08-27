/**
 * @author George
 * 增减字符串的操作
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 *
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 *
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 *
 * 示例 1：
 *
 * 输出："IDID"
 * 输出：[0,4,1,3,2]
 * 示例 2：
 *
 * 输出："III"
 * 输出：[0,1,2,3]
 * 示例 3：
 *
 * 输出："DDI"
 * 输出：[3,2,0,1]
 */
public class Leetcode0411 {

    public int[] diStringMatch(String S) {
        //创建变量size存储s的长度
        int size = S.length();
        //根据S的长度来创建对应的数组的长度
        int[] ret = new int[size+1];
        //分别创建i和d来代表对应的增减操作
        int i = 0;
        int d = size;
        //遍历字符串的每一个字符，如果是d，则讲d赋值给相对应的数组
        for (int j = 0; j < size; j++) {
            if (S.charAt(j) == 'D') {
                ret[j] = d;
                d--;
            }else{
                ret[j] = i;
                i++;
            }
        }
        ret[size] = d;
        return ret;


    }


}
