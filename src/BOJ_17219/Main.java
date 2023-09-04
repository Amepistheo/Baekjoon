// 17219번 비밀번호 찾기
package BOJ_17219;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<String, String> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            map.put(st.nextToken(), st.nextToken());
        }

        for (int i=0; i<M; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }

        System.out.print(sb);
    }
}