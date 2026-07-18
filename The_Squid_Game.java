import java.util.*;
import java.lang.*;
import java.io.*;

public class The_Squid_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }
            Arrays.sort(A);
            int maxPrize = 0;
            for (int j = 1; j < N; j++) {
                maxPrize = maxPrize + A[j];
            }
            System.out.println(maxPrize);
        }
    }
}
