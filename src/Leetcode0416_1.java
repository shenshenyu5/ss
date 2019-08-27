/**
 * @author George
 * 给定一个矩阵A，返回A的转置矩阵
 * 矩阵的转置是指将矩阵的主对角线翻转，减缓矩阵的行和列
 *
 * 示例 1：
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 *
 * 示例 2
 * 输入：[[1,2,3],[4,5,6]
 */
public class Leetcode0416_1 {
    /**
     * 具体算法：创建一个二维数组，数组空间为 int[j][i]
     *将A[i][j] 的数值赋值给 arr[j][i]这样的话就实现了矩阵的转置
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int outLength = A.length;
        int inLength = A[0].length;
        int[][] arr = new int[inLength][outLength];
        for (int i = 0; i < outLength; i++) {
            for (int j = 0; j < inLength; j++) {
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }
}
