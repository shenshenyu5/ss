//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Leetcode0419_1 {
//    public static void main(String[] args) {
//       // numRookCaptures(new char[][]{});
//    }
//
//
//    public List<String> subdomainVisits(String[] cpdomains) {
//        int len = cpdomains.length;
//        int times = 0;
//        String url = "";
//        for (int i = 0; i < len; i++) {
//            String[] timesAndUrl = cpdomains[i].split(" ");
//            times = Integer.parseInt(timesAndUrl[0]);
//            url = timesAndUrl[1];
//            System.out.println(url);
//            String url1 = url.substring(url.lastIndexOf(".")+1);
//            System.out.println(url1);
//            String url2 = url.substring(url.indexOf(".")+1);
//            System.out.println(url2);
//
//        }
//    }
//
//}
