import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000000;
        int min = 1000000;
        int N = sc.nextInt();
        int[] arg = new int[N];
        for (int i = 0; i < N; i++) {
            arg[i] = sc.nextInt();
            if (arg[i] > max) {
                max = arg[i];
            }
            if (arg[i] < min) {
                min = arg[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
