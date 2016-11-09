import java.util.Scanner;

public class p557B2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		if (n > m) {
			System.out.println("YES");
			scan.close();
			return;
		}
		
		
		int[] a = new int[n];

		for (int x = 0; x < n; x++) {
			a[x] = scan.nextInt() % m;
			if (a[x] == 0) {
				System.out.println("YES");
				scan.close();
				return;
			}
		}
		scan.close();
		boolean[][] b = new boolean[n][m];
		b[0][a[0]] = true;
		for (int x = 1; x < n; x++) {
			b[x][a[x]] = true;
			for (int y = 1; y < m; y++) {
				if (b[x-1][y]) {
					b[x][y] = true;
					int c = (y + a[x]) % m;
					b[x][c] = true;
				}
			}
			if (b[x][0]) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");

	}

}
