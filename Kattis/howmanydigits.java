import java.util.Scanner;

public class howmanydigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] values = new double[1000001];
		for (int x = 1; x < values.length; x++) {
			values[x] = Math.log10(x) + values[x - 1];
		}
		
		do {
			System.out.println((int)values[scan.nextInt()] + 1);
		} while (scan.hasNext());
		scan.close();
	}

}
