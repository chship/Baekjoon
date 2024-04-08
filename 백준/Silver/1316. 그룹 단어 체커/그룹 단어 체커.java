import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j) - 'a';
                if (arr[ch]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }
            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
