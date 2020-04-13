import sun.security.krb5.internal.crypto.Aes128;

import java.util.Arrays;

public class ArrayDemo {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int preSum = 0;
        int nowNum = 0;
        int j = 0;
        //求当前数组的和
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //再做一次循环 找到对应关系返回结果
        for (; j < nums.length; j++) {
            preSum += nums[j];
            nowNum = nums[j];
            if (preSum-nowNum == sum - preSum) {
                return j;
            }
        }

            return -1;
    }

    public static int dominantIndex(int[] nums) {
        int max = 0 ;
        int sencMax = 0 ;
        int j = 0;
        int k = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
        }
        System.out.println("最大值是:"+max);
        for ( ;j < nums.length; j++) {
            if (nums[j]>sencMax&&nums[j]<max){
                sencMax = nums[j];
            }
        }
        for (; k < nums.length; k++) {
            if (max == nums[k]) {
                break;
            }
        }
        System.out.println(sencMax);
        if (max>=sencMax*2) {
            return k ;
        }

        return  -1 ;
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            System.out.println(digits[digits.length-1]);
            if (digits[i]!=9){
                digits[i] ++;
                return digits;
            }
                digits[i] = 0;
        }
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
    }

    public static void main(String[] args) {
         int[] a1 = {9,9};
        //System.out.println(pivotIndex(a1));
        //System.out.println(dominantIndex(a1));
        System.out.println(Arrays.toString(plusOne(a1)));

    }
}