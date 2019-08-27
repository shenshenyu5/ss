/**
 * @author George
 *
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * 示例:
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */
public class Leetcode0417_2 {
    /**
     * 自己通过递归实现，各位相加的写法主要就是把各个位置提取出来
     * int value = num;
     * while(value>num){
     *     int res = value %10;
     *     value /=10;
     * }
     * @param num
     * @return
     */
    public static int addDigits(int num) {
        int value = num;
        int res = 0;
        while (value > 0) {
             res += value%10;
             value /= 10;
        }
        if(res<10){
            return res;
        }else{
          return   addDigits(res);
        }



    }

    /**
     * leetcode上面的算法
     * 这个方法很巧妙
     * 如果小于等于9 则直接返回num
     * 如果能被9整除，则返回9；
     * 如果不能被9整除，则返回余数
     * @param num
     * @return
     */
    public static int addDigit(int num){
        if(num<=9)
            return num;
        else if(num%9==0)
            return 9;
        else
            return num%9;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(38));

    }
}
