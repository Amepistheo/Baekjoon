// 17212번 달나라 토끼를 위한 구매대금 지불 도우미
package BOJ_17212;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        dp[5] = 1;
        dp[6] = 2;
        dp[7] = 1;

        for (int i = 8; i <= N; i++) {
            dp[i] = Math.min(dp[i-1], Math.min(dp[i-2], Math.min(dp[i-5], dp[i-7]))) + 1;
        }

        System.out.println(dp[N]);
    }
}