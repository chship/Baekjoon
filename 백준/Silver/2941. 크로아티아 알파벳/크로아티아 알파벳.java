import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = sc.next();

        int count = 0;
        int index = 0;
        while (index < word.length()) {
            boolean found = false;
            for (String croatian : croatianAlphabet) {
                if (word.startsWith(croatian, index)) {
                    index += croatian.length();
                    count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                index++;
                count++;
            }
        }

        System.out.println(count);
    }
}