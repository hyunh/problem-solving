import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int s = Integer.parseInt(input[0]);
        int min = s;
        int max = s;
        for (int i = 1; i < input.length; i++) {
            s = Integer.parseInt(input[i]);
            if (min > s) {
                min = s;
            }
            else if (max < s) {
                max = s;
            }
        }

        System.out.println(max - min);
    }
}
