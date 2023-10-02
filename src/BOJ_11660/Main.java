// 11660번 구간 합 구하기 5
package BOJ_11660;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N+1][N+1];

        // 표에 입력값 저장
        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=1; j<=N; j++) {
                map[i][j] = map[i-1][j] + map[i][j-1] - map[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = map[x2][y2] - map[x1-1][y2] - map[x2][y1-1] + map[x1-1][y1-1];

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}