import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (sb.length() > 0) {
                        sb.append(" + ");
                    }
                    sb.append(i);
                }
            }
            if (sum == n) {
                System.out.println(n + " = " + sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}