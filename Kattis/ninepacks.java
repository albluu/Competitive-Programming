import java.util.Scanner;

public class ninepacks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// DP storage
		int[] Ha = new int[100001];
		int[] Ba = new int[100001];
		for (int x = 1; x < 100001; x++) {
			Ha[x] = 101;
			Ba[x] = 101;
		}
		
		int H = scan.nextInt();
//		int Hc = 0;
		for (int x = 0; x < H; x++) {
			int Hi = scan.nextInt();
//			Hc += Hi;
			for (int y = 100000; y >= Hi; y--) {
				Ha[y] = Math.min(Ha[y], Ha[y - Hi] + 1);
			}
		}
		
		int B = scan.nextInt();
//		int Bc = 0;
		for (int x = 0; x < B; x++) {
			int Bi = scan.nextInt();
//			Bc += Bi;
			for (int y = 100000; y >= Bi; y--) {
				Ba[y] = Math.min(Ba[y], Ba[y - Bi] + 1);
			}
		}
		scan.close();
//		int HBm = Math.max(Hc, Bc);
		int HBm = 100000;
		int out = 200;
		for (int x = 1; x < HBm; x++) {
			if (Ha[x] < 101 && Ba[x] < 101) {
				out = Math.min(out, Ha[x] + Ba[x]);
			}
		}
		System.out.println(out == 200 ? "impossible" : out);
		
	}
}
