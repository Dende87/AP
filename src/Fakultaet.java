
public class Fakultaet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = IO.readInt("Bitte eine Zahl eingeben: ");
		
		IO.print(fakultaet(n));
	}

	public static int fakultaet(int n) {
		if (n <= 1)
			return 1;
		return n * fakultaet(n - 1);
	}

}
