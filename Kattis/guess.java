import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean q = true, s = true, pq = true; 
			
			Queue<Integer> queue = new LinkedList<Integer>();
			Stack<Integer> stack = new Stack<Integer>();
			PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
			
			for (int x = 0; x < n; x++) {
				int t = scan.nextInt();
				if (t == 1) {
					int a = scan.nextInt();
					queue.add(a);
					stack.add(a);
					pqueue.add(-a);
				} else {
					int b = scan.nextInt();
					try {
						if (queue.poll() != b) q = false;
						if (stack.pop() != b) s = false;
						if (pqueue.poll() != -b) pq = false;
					} catch (Exception e) {
						q = false;
						s = false;
						pq = false;
					}
				}
			}
			if (q && !s && !pq) System.out.println("queue");
			else if (!q && s && !pq) System.out.println("stack");
			else if (!q && !s && pq) System.out.println("priority queue");
			else if (q || s || pq) System.out.println("not sure");
			else System.out.println("impossible");
			
		}
		scan.close();
	}

}
