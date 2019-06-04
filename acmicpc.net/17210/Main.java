import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (N >= 6) {
            System.out.println("Love is open door");
        }
        else {
            for (int i = 0; i < N - 1; i++) {
                n = (n == 0) ? 1 : 0;
                System.out.println(n);
            }
        }
    }
}
