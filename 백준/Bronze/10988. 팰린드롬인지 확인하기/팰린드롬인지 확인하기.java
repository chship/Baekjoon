import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int result = 1;
		for(int i = 0; i < word.length() / 2 ; i++) {
			if(word.charAt(i) != word.charAt(word.length()-1-i)){
				result = 0;
				break;
			}
		}
		System.out.println(result);
	}
}