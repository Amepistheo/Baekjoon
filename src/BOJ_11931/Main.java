// 11931번 수 정렬하기 4
package BOJ_11931;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Integer[] num = new Integer[N];

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            sb.append(num[i]).append("\n");
        }

        System.out.print(sb);
    }
}