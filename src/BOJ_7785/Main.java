// 7785번 회사에 있는 사람
package BOJ_7785;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String work = st.nextToken();

            if (work.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, Collections.reverseOrder());

        for (String name : list) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}