// 4097번 수익
package BOJ_4097;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0) {
                break;
            }

            int sum = 0;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int P = Integer.parseInt(br.readLine());

                sum += P;
                max = Math.max(max, sum);

                if (sum < 0) {
                    sum = 0;
                }
            }

            sb.append(max).append("\n");
        }

        System.out.print(sb);
    }
}