/**
 * @author George
 * 数字的补数
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 *
 * 注意:
 *
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0
 */
public class Leetcode0416_2 {
    /**
     * 本题主要考察的是 移位运算和逻辑与
     * <<按位置左移运算符，2<<2 等于2*2的平方
     * >>按位置右移运算符，8>>2 等于 8/2的平方
     * >>>当 前数为正数时跟  >>是一样的
     *Math.pow（double a,double b） 返回a的b次幂
     * @param num
     * @return
     */
    public static int findComplement(int num) {
        int n = 0,i=0;
        while (n<31) {
            if(((num>>>n)&1)==1){
                i = n;
            }
            n++;
        }
        return (int)(Math.pow(2,i+1)-1-num);
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,2));

    }
}
