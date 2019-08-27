/**
 * @author George
 * �����
 * ����һ������� (ransom) �ַ�����һ����־(magazine)�ַ������жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�������Թ��ɣ����� true �����򷵻� false��
 *
 * (��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼��)
 */
public class Leetcode0417 {

    public boolean canConstruct(String ransomNode,String magazine) {
        int len1 = ransomNode.length();
        int len2 = magazine.length();
        if (len1>len2) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len1; i++) {
            int index = sb.indexOf(magazine.charAt(i)+"");
            if (index==1) {
                return false;
            }
            sb.deleteCharAt(index);
        }
        return true;
    }
}
