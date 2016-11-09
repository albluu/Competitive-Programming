import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class p557B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] d = new int[n];
		for (int x = 0; x < n; x++) {
			d[x] = scan.nextInt();
		}
		scan.close();
		
	
		
//		int n = 990;
//		int m = 993;
//		int[] d = new int[n];
//		boolean b = true;
//		for (int x = 0; x < n; x++) {
//			d[x] = b? 991 : 992;
//			b = b? false: true;
//		}
		
		long start = System.currentTimeMillis();
		
		HashSet<Integer> set = new HashSet<Integer>(300000);
		
		set.add(d[0]);
		
		if (n < m) {
			for (int c = 1; c < n; c++) {
				ArrayList<Integer> toAdd = new ArrayList<Integer>();
				toAdd.add(d[c]);
				for (int q : set) {
					toAdd.add(q + d[c]);
				}
				set.addAll(toAdd);
			}
			
			System.out.println(set.size());
			boolean yes = false;
			for (int v : set) {
				if (v % m == 0) {
					yes = true;
					break;
				}
			}
			System.out.println(yes ? "YES" : "NO");
		} else {
			System.out.println("YES");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + " ms");
	}

}
