import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * �Գ���
 *
 * @author George
 * �Գ��� ��ָ���Ա���������ÿһλ������������
 * ���磬128 ��һ���Գ�������Ϊ 128 % 1 == 0��128 % 2 == 0��128 % 8 == 0��
 * ���У��Գ������������ 0 ��
 * �����ϱ߽���±߽����֣����һ���б��б��Ԫ���Ǳ߽磨���߽磩�����е��Գ�����
 */

public class Leetcode0416_3 {
    /**
     * ������Ѷ���������жϸ����Ƿ��ܱ��Լ���ʡ�ĸ���λ������
     * ���㷨����Ҫ��ס
     * �ȶ���һ��value������value����0ʱ��
     * ��whileѭ��
     * �ж��Ƿ��ܱ�10���� ������ܣ�ͬʱ�������Ը�������������
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
