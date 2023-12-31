import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j] && dp[i] <= dp[j]) dp[i] = dp[j] + 1;
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}


/*
10 30 10 20 20 10
1  1  2  2  2  3

dp[i] = 앞 숫자가 뒤 숫자보다 크다면 dp[i-1]++ / 아니면 dp[i-1]
 */