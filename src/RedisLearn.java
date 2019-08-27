import java.util.Scanner;

public class RedisLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long jiecheng[] = new long[21];
        jiecheng[0]=1;
        for (int i = 0; i < 21; i++) {
            jiecheng[i] = jiecheng[i-1]*i;
        }
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            System.out.println(jiecheng[x]);
        }

    }

}
