
public class Dreiecksmatrix {
	static int[][] matrix = { { 1, 2, 3 }, { 0, 4, 4 }, { 0, 0, 6 } };

	public static void main(String[] args) {
		int x = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if (matrix[i][j] < matrix[i][j + 1]) {
						x = 0;
					} else {
						x = 1;
					}
				}
			}
			if (x == 0) {
				IO.println("Dreiecksmatrix");
			} else {
				IO.println("keine Dreiecksmatrix");
			}
		
	}
}
