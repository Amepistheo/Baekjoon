// 2309번 일곱 난쟁이
package BOJ_2309;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] dwarf = new int[9];

        int sum = 0;

        for (int i=0; i<9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        Arrays.sort(dwarf);

        int first = 0;
        int second = 0;

        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if ((sum - dwarf[i] - dwarf[j]) == 100) {
                    first = dwarf[i];
                    second = dwarf[j];
                    break;
                }
            }
        }

        for (int i=0; i<9; i++) {
            if (first == dwarf[i] || second == dwarf[i]) {
                continue;
            }
            else {
                sb.append(dwarf[i]).append("\n");
            }
        }

        System.out.print(sb);
    }
}