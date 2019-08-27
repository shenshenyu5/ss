/**
 * @author George
 * 斐波那契数的算法
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 *
 *
 *
 * 示例 1：
 *
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 * 示例 2：
 *
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
 * 示例 3：
 *
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3.
 */
public class Leetcode0410 {
    /**
     * 自己写的递归算法，此算法40以内的数，算起来很快，到了50之后会出现性能瓶颈
     * 执行用时15ms,击败了45%的用户
     * 内存消耗32.3mb击败了100%的用户
     * @param N
     * @return
     */
    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        return fib(N-1)+fib(N-2);
    }

    /**
     * 菲波那切数列模板,此方法性能大幅度的提高
     * @param N
     * @return
     */
    public static int fib1(int N) {
        if (N==0) {
            return 0;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= N; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }


    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        System.out.println(fib1(100));
        double end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
