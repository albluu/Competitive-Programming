import java.util.Scanner;

public class eightqueen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] loc = new int[8][2];
		int z = 0;
		for (int x = 0; x < 8; x++) {
			char[] ca = scan.next().toCharArray();
			for (int y = 0; y < 8; y++) {
				if (ca[y] == '*') {
					loc[z++] = new int[] {x, y};
				}
			}
		}
		scan.close();
	}
}
