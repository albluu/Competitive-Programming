import java.util.Scanner;

public class growlinggears {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int x = 0; x < test; x++) {
			int n = scan.nextInt();
			double max = Double.MIN_VALUE;
			int gear = 0;
			for (int y = 0; y < n; y++) {
				double a = scan.nextDouble();
				double b = scan.nextDouble();
				double c = scan.nextDouble();
				
				double root = b / (a * 2);
				double torque = (b * root) + c - (a * Math.pow(root, 2));
				if (max < torque) {
					max = torque;
					gear = y;
				}
			}
			System.out.println(gear + 1);
		}
		scan.close();
	}

}
