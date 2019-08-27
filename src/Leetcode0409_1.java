import java.util.Arrays;

/**
 * @author George
 * 实现一个字符串中的元音字母的调转
 */
public class Leetcode0409_1 {
    public String reverseVowels(String s) {
//
        char str[] = s.toCharArray();
        int i=0;
        int j=str.length-1;
        for(;i<j;i++) {
            if("AEOUIaeoui".contains(str[i]+""))
                for(;j>i;j--) {
                    if("AEOUIaeoui".contains(str[j]+"")) {
                        char temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                        j--;
                        break;
                    }
                }
        }
        return new String(str);
    }


    public static void main(String[] args) {
        Leetcode0409_1 leetcode0409_1 = new Leetcode0409_1();
        System.out.println(leetcode0409_1.reverseVowels("ai"));
    }
}
