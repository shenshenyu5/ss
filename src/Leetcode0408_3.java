import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author George
 * 实现函数ToLowerCase,该函数接收一个字符串参数str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串
 */
public class Leetcode0408_3 {
    /**
     * leetcode上相对较为巧妙的算法，
     * @param string
     * @return
     */
   public String toLower(String string) {
       char[] cs = string.toCharArray();
       for(int i=0;i<cs.length;i++) {
           if(cs[i]<='Z' && cs[i]>='A') {
               cs[i]=(char)(cs[i]+32);
           }
       }
       return String.valueOf(cs);
   }



    /**
     * 自己解法，代码写的不行比较垃圾
     * 执行用时4ms击败了0.75%的用户
     * 内存消耗33.6mb提交击败了0.96%的用户
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        String newstr = "";
        Map<Character,String> dic = new HashMap<Character, String>();
        dic.put('A',"a");
        dic.put('B',"b");
        dic.put('C',"c");
        dic.put('D',"d");
        dic.put('E',"e");
        dic.put('F',"f");
        dic.put('G',"g");
        dic.put('H',"h");
        dic.put('I',"i");
        dic.put('J',"j");
        dic.put('K',"k");
        dic.put('L',"l");
        dic.put('M',"m");
        dic.put('N',"n");
        dic.put('O',"o");
        dic.put('P',"p");
        dic.put('Q',"q");
        dic.put('R',"r");
        dic.put('S',"s");
        dic.put('T',"t");
        dic.put('U',"u");
        dic.put('V',"v");
        dic.put('W',"w");
        dic.put('X',"x");
        dic.put('Y',"y");
        dic.put('Z',"z");
        System.out.println(dic.size());
        char[] abcs = str.toCharArray();
        System.out.println(Arrays.toString(abcs));

        for (int i = 0; i < abcs.length; i++) {
            if (dic.get(abcs[i])==null){
                newstr+=abcs[i];
            }
            if (dic.get(abcs[i]) != null) {
                System.out.println(abcs[i]);
                System.out.println(dic.get(abcs[i]));
                newstr += dic.get(abcs[i]);
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        Leetcode0408_3 demo3 = new Leetcode0408_3();
        String string =  demo3.toLowerCase("SSyYZabnA");
        System.out.println(string);
    }
}
