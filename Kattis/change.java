import java.util.Arrays;
import java.util.Scanner;

public class change {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int x = 0; x < t; x++) {
			int n = scan.nextInt();
			int[] coin = new int[n];
			for (int c = 0; c < n; c++) {
				coin[c] = scan.nextInt();
			}
			Arrays.sort(coin);
		}
		

	}

}
