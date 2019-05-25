import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            int point = Integer.parseInt(input[0]);
            int color = Integer.parseInt(input[1]);

            List<Integer> points = map.get(color);
            if (points == null) {
                points = new ArrayList<>();
                map.put(color, points);
            }
            points.add(point);
        }

        int result = 0;
        for (List<Integer> points : map.values()) {
            List<Integer> sorted = points.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i < sorted.size(); i++) {
                if (i == 0) {
                    result += (sorted.get(1) - sorted.get(0));
                }
                else if (i == sorted.size() - 1) {
                    result += (sorted.get(i) - sorted.get(i - 1));
                }
                else {
                    int l = sorted.get(i) - sorted.get(i - 1);
                    int g = sorted.get(i + 1) - sorted.get(i);
                    result += ((l > g) ? g : l);
                }
            }
        }
        System.out.println(result);
    }
}
