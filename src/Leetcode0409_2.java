import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author George
 * �����ǲ�����������Ľ���
 * �����������飬��дһ���������������ǵĽ�����
 *
 * ʾ�� 1:
 *
 * ����: nums1 = [1,2,2,1], nums2 = [2,2]
 * ���: [2]
 * ʾ�� 2:
 *
 * ����: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * ���: [9,4]
 * ˵��:
 *
 * �������е�ÿ��Ԫ��һ����Ψһ�ġ�
 * ���ǿ��Բ�������������˳��
 */
public class Leetcode0409_2 {
    /**
     * �Լ�д�ģ�����Ƚ�������ִ����ʱ30ms������10.46%���û�
     * �ڴ�����38.7mb���ύ�л�����0.8%���û�
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        /*
            ͨ��setȥ��
         */
        Set<Integer> one = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    one.add(nums1[i]);
                }
            }
        }
        int[] result = new int[one.size()];
        Iterator iterator = one.iterator();
        for (int i = 0; i < one.size(); i++) {
            while (iterator.hasNext()) {
                result[i] = (int)iterator.next();
                break;
            }
        }
        return result;
    }

    /**
     * leetcode�ϵĽⷨ
     * @param nums1
     * @param nums2
     * @return
     */
//    public int[] intersection1(int[] nums1, int[] nums2) {
//
//    }

    public static void main(String[] args) {
        Leetcode0409_2 leetcode0409_2 = new Leetcode0409_2();
        System.out.println(leetcode0409_2.intersection(new int[]{4, 5, 6}, new int[]{5, 6}));
    }
}
