// 9655번 돌 게임
package BOJ_9655;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) {
            System.out.println("CY");
        }
        else {
            System.out.println("SK");
        }
    }
}