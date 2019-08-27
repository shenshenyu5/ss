/**
 * @author George
 * 쳲����������㷨
 * 쳲���������ͨ���� F(n) ��ʾ���γɵ����г�Ϊ쳲��������С��������� 0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), ���� N > 1.
 * ���� N������ F(N)��
 *
 *
 *
 * ʾ�� 1��
 *
 * ���룺2
 * �����1
 * ���ͣ�F(2) = F(1) + F(0) = 1 + 0 = 1.
 * ʾ�� 2��
 *
 * ���룺3
 * �����2
 * ���ͣ�F(3) = F(2) + F(1) = 1 + 1 = 2.
 * ʾ�� 3��
 *
 * ���룺4
 * �����3
 * ���ͣ�F(4) = F(3) + F(2) = 2 + 1 = 3.
 */
public class Leetcode0410 {
    /**
     * �Լ�д�ĵݹ��㷨�����㷨40���ڵ������������ܿ죬����50֮����������ƿ��
     * ִ����ʱ15ms,������45%���û�
     * �ڴ�����32.3mb������100%���û�
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
     * �Ʋ���������ģ��,�˷������ܴ���ȵ����
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
