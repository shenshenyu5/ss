import java.util.HashMap;
import java.util.Map;

/**
 * @author George
 * Excel�������
 * ����һ��Excel����е������ƣ���������Ӧ������š�
 *
 * ���磬
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * ʾ�� 1:
 *
 * ����: "A"
 * ���: 1
 * ʾ�� 2:
 *
 * ����: "AB"
 * ���: 28
 * ʾ�� 3:
 *
 * ����: "ZY"
 * ���: 701
 */
public class Leetcode0417_1 {
    /**
     * ����˼·������һ������value�洢
     * ���ַ���ֻ��һ���ַ�ʱ�����ص���1-26
     * ����value�ĳ�ʼֵ��0��
     * �����ַ����ĳ��Ƚ��б�����Ȼ�����charAt��������ÿһλ���ַ���ʲô����A��+1����
     * �㷨��Զ����ǱȽ�������
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
