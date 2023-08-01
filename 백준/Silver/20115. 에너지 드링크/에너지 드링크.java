import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] drinks = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) drinks[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(drinks);

        double maxLiter = drinks[N - 1];
        for (int i = 0; i < N - 1; i++) {
            maxLiter += (double) drinks[i] / 2;
        }
        
        System.out.println(maxLiter);
    }
}