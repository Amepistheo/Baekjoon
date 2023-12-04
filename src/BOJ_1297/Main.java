// 1297번 TV 크기
package BOJ_1297;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        double D = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        double W = Double.parseDouble(st.nextToken());

        double x = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
        double sqrt = Math.sqrt(x);

        System.out.println((int)(sqrt * H) + " " + (int)(sqrt * W));
    }
}