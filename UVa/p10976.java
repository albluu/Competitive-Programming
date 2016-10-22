import java.util.ArrayList;
import java.util.Scanner;

public class p10976 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int k = scan.nextInt();
			ArrayList<int[]> r = new ArrayList<int[]>();
			for (int q = k + 1; q <= 2 * k; q++) {
				double kd = 1 / (double) k;
				double qd = 1 / (double) q;
				double result = 1 / (kd - qd);
				if (result - Math.floor(result + .00008) < .00008) {
					r.add(new int[] { (int) (result + .00008), q });
				}
			}
			System.out.println(r.size());
			for (int[] o : r) {
				System.out.println("1/" + k + " = 1/" + o[0] + " + 1/" + o[1]);
			}
		}
		scan.close();

	}

}
