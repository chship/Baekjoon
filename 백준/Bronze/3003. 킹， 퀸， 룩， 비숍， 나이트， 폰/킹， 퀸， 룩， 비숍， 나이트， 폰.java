import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8};
		int[] original = new int[6];
		int[] result = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int num = sc.nextInt();
			original[i] = num;
		}
		for(int i = 0; i < 6; i++) {
			result[i] = chess[i] - original[i];
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}