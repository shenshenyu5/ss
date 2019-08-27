/**
 * @author George
 * 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
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
