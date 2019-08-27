/**
 * @author George
 *
 * ����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
 * ʾ��:
 * ����: 38
 * ���: 2
 * ����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2��
 */
public class Leetcode0417_2 {
    /**
     * �Լ�ͨ���ݹ�ʵ�֣���λ��ӵ�д����Ҫ���ǰѸ���λ����ȡ����
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
     * leetcode������㷨
     * �������������
     * ���С�ڵ���9 ��ֱ�ӷ���num
     * ����ܱ�9�������򷵻�9��
     * ������ܱ�9�������򷵻�����
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
