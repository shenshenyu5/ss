/**
 * @author George
 * ����һ������A������A��ת�þ���
 * �����ת����ָ����������Խ��߷�ת������������к���
 *
 * ʾ�� 1��
 * ���룺[[1,2,3],[4,5,6],[7,8,9]]
 * �����[[1,4,7],[2,5,8],[3,6,9]]
 *
 * ʾ�� 2
 * ���룺[[1,2,3],[4,5,6]
 */
public class Leetcode0416_1 {
    /**
     * �����㷨������һ����ά���飬����ռ�Ϊ int[j][i]
     *��A[i][j] ����ֵ��ֵ�� arr[j][i]�����Ļ���ʵ���˾����ת��
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
