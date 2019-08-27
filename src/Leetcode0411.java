/**
 * @author George
 * �����ַ����Ĳ���
 * ����ֻ�� "I"�����󣩻� "D"����С�����ַ��� S ���� N = S.length��
 *
 * ���� [0, 1, ..., N] ���������� A ʹ�ö������� i = 0, ..., N-1�����У�
 *
 * ��� S[i] == "I"����ô A[i] < A[i+1]
 * ��� S[i] == "D"����ô A[i] > A[i+1]
 *
 *
 * ʾ�� 1��
 *
 * �����"IDID"
 * �����[0,4,1,3,2]
 * ʾ�� 2��
 *
 * �����"III"
 * �����[0,1,2,3]
 * ʾ�� 3��
 *
 * �����"DDI"
 * �����[3,2,0,1]
 */
public class Leetcode0411 {

    public int[] diStringMatch(String S) {
        //��������size�洢s�ĳ���
        int size = S.length();
        //����S�ĳ�����������Ӧ������ĳ���
        int[] ret = new int[size+1];
        //�ֱ𴴽�i��d�������Ӧ����������
        int i = 0;
        int d = size;
        //�����ַ�����ÿһ���ַ��������d����d��ֵ�����Ӧ������
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
