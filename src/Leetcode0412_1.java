public class Leetcode0412_1 {
    public static  int hammingDistance(int x,int y) {
      String  xstring =  Integer.toBinaryString(x);
      String  ystring =  Integer.toBinaryString(y);
        System.out.println(xstring);
        System.out.println(ystring);
        return 0;
    }

    public static void main(String[] args) {
        hammingDistance(1,4);
    }
}
