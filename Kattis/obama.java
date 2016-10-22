import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class obama {
	static int[] value = new int[20001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int q = 0; q < t; q++) {
			int val = scan.nextInt();
			int c = scan.nextInt();
			Stack<Integer> coin = new Stack<Integer>();
			for (int r = 0; r < c; r++) {
				coin.add(scan.nextInt());
			}
			
			thing(coin, 0, 0);

		}
	}
	
	public static void thing(Stack<Integer> list, int sum, int total) {
		if (value[sum] > total) {
			int add = list.pop();
			if(list.empty()) return;
			thing(list, sum, total);
			thing(list, sum + add, total + 1);
			value[sum] = total;
			value[sum+add] = total+1;
		}
	}
	
	

}
