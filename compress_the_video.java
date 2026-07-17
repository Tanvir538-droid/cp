import java.util.Scanner;

public class compress_the_video {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }
            int temp = A[0];
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (temp != A[j]) {
                    count++;
                    temp = A[j];
                }
            }

            System.out.println(count);
        }
    }
}