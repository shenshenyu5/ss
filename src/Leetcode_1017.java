import com.sun.javafx.sg.prism.NGWebView;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1017 {
    public int removeDuplicates(int[] nums) {
       int number = 0;
        //输入数组长度为0时，返回0
        if (nums.length==0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[number]!=nums[i]) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1;
        return number;
    }

    public static void main(String[] args) {
        int[] nums =  {1,2,3,4,4,5,5,6,6,6,6,6,6,6,6,};
        Leetcode_1017 leet = new Leetcode_1017();
        System.out.println(leet.removeDuplicates(nums));
    }
}
