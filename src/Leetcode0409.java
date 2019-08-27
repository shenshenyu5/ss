import java.util.Arrays;

/**
 * @author George
 * 实现字符串中字母的调转
 */
public class Leetcode0409 {
    public void reverseString(char[] s) {
        int sLength = s.length;
        int temp = 0;
        for (int i = 0; i <sLength/2 ; i++) {
                 temp = s[i];
                 s[i] = s[sLength-i-1];
                 s[sLength-i-1] = (char) temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        Leetcode0409 leetcode0409 = new Leetcode0409();
        leetcode0409.reverseString(new char[]{'a','b','c','d'});
    }
}
