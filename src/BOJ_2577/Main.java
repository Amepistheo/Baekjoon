// 2577번 숫자의 개수
package BOJ_2577;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = String.valueOf(A * B * C);

        int[] count = new int[10];

        for (int i=0; i<result.length(); i++) {
            count[(result.charAt(i) - 48)]++;
        }

        for (int i=0; i<10; i++) {
            sb.append(count[i]).append("\n");
        }

        System.out.print(sb);
    }
}