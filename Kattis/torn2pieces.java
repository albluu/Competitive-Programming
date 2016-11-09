import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class torn2pieces {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		
		int n = scan.nextInt();
		HashMap<String, Node> map = new HashMap<String, Node>();
		for (int x = 0; x < n; x++) {
			String[] con = scan.nextLine().split(" ");
			Node start = map.getOrDefault(con[0], new Node(con[0]));
			for (int y = 1; y < con.length; y++) {
				Node next = map.getOrDefault(con[y], new Node(con[y]));
				start.addLeaf(next);
				next.addLeaf(start);
				map.put(con[y], next);
			}
			map.put(con[0], start);
		}
		
		Stack<Node> stack = new Stack<Node>();
		HashSet<Node> visited = new HashSet<Node>();
		Node begin = map.get(scan.next());
		Node end = map.get(scan.next());
		Stack<Node> path = new Stack<Node>();
		boolean found;
		if (begin == null || end == null) {
			System.out.println("no route found");
		} else {
			stack.push(begin);
			found = false;
			do {
				Node curr = stack.pop();
				path.push(curr);
				if (curr == end) {
					found = true;
				} else {
					ArrayList<Node> leaves = curr.getLeaves();
					leaves.removeAll(visited);
					if (leaves.isEmpty()) {
						path.pop();
					} else {
						stack.addAll(leaves);
					}
					visited.add(curr);
				}
				
			} while (!stack.isEmpty() && !found);
			
			Node[] finalpath = new Node[path.size()];
			path.copyInto(finalpath);
			
			if (found) {
				for (Node no : finalpath) {
					System.out.print(no.name + " ");
				} 
			} else {
				System.out.println("no route found");
			}
		}
	}
	
	public static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static class Node {
		String name;
		ArrayList<Node> leaves = new ArrayList<Node>();
		
		public Node(String Name) {
			name = Name;
		}
		
		public void addLeaf(Node toAdd) {
			leaves.add(toAdd);
		}
		
		public ArrayList<Node> getLeaves() {
			return leaves;
		}
	}

}
