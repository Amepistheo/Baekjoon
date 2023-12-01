// 1712번 손익분기점
package BOJ_1712;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        if (C <= B) {
            System.out.println(-1);
        }
        else {
            System.out.println((A/(C-B)) + 1);
        }
    }
}