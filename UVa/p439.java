import java.util.ArrayList;
import java.util.Scanner;

public class p439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[] line;
		while (scan.hasNext()) {
			line = scan.nextLine().toCharArray();
			calc(line);
		}
		scan.close();
	}

	public static void calc(char[] moves) {
		int[] loc = { moves[0] - 97, moves[1] - 49, moves[3] - 97, moves[4] - 49 };
		int[][] map = new int[8][8];
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				map[x][y] = 64;
			}
		}
		map[loc[0]][loc[1]] = 0;
		genMoveMap(loc, 0, loc, map);
		System.out.println("To get from " + moves[0] + moves[1] + " to " + moves[3] + moves[4] + " takes "
				+ map[loc[2]][loc[3]] + " knight moves.");
	}

	public static void genMoveMap(int[] currLoc, int chainLength, int[] moveCase, int[][] moveMap) {
		ArrayList<int[]> validMoves = getValidMoves(currLoc);
		for (int[] move : validMoves) {
			if (moveMap[move[0]][move[1]] > chainLength && chainLength < 7) {
				moveMap[move[0]][move[1]] = chainLength + 1;
				genMoveMap(move, chainLength + 1, moveCase, moveMap);
			}
		}
	}

	public static final int[] validX = { 2, 2, 1, 1, -1, -1, -2, -2 };
	public static final int[] validY = { -1, 1, -2, 2, -2, 2, -1, 1 };

	public static ArrayList<int[]> getValidMoves(int[] location) {
		ArrayList<int[]> ret = new ArrayList<int[]>();
		for (int i = 0; i < 8; i++) {
			int tx = location[0] + validX[i];
			int ty = location[1] + validY[i];
			if (0 <= tx && tx < 8 && 0 <= ty && ty < 8) {
				ret.add(new int[] { tx, ty });
			}
		}
		return ret;
	}
}
