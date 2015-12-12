
public class GraphMatrix {

	static boolean[][] matrix = { 
			{ false, true, true, true }, 
			{ false, false, false, false },
			{ true, false, true, false }, 
			{ false, true, false, false } 
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Jede Zeile ein Wahrheitswert, wobei x ungleich y sein muss

		int leangeMatrix = matrix.length;
		boolean CheckMatrix = true;
		for (int k = 0; k < leangeMatrix; k++) {
			if (matrix[k].length != matrix.length) {
				IO.println("Keine NxN Matrix!");
				CheckMatrix = false;
				break;
			}
		}

		if (CheckMatrix == true) {
			boolean hilfeCheck = false;
			for (int i = 0; i < matrix.length; i++) {
				hilfeCheck = false;
				for (int j = 0; j < matrix.length; j++) {
					if (i != j) {
						if (matrix[i][j] == true) {
							hilfeCheck = true;
						}
					}
				}
				if (hilfeCheck == false) {
					IO.println("Kein vollständiger Graph!");
					break;
				}
			}
			if (hilfeCheck == true)
				IO.println("Vollständiger Graph");
		}
	}

}
