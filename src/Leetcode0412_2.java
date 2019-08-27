public class Leetcode0412_2 {
    public static int repeateNTimes(int[] A) {
        int count = 0;
        int result = 0;
        int[] B = A;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i]==B[j]){
                    count++;
                    result = A[i];
                }
            }
        }
        if(A.length/2==(count-1)){
            return result;
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(repeateNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }
}
