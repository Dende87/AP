
public class Aufgabe8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = IO.readDouble("Zahl a eingeben: ");
		int n = IO.readInt("Zahl n eingeben: ");
		IO.println(pot(a, n));

	}

	//2hoch3        2*(2*(2*(1)
	//2hoch-3       1/(2*(2*(-2*-1(1)))
	public static double pot(double a, int n) {

		double erg;
		if (n > 0) {
			return erg = a * pot(a, n -1);
		}else if(n < 0){
			return erg = 1 / (a * pot(a, ((n*-1)-1))) ;
		}else{
			return 1;
		}
	}

	static int zahl(){
		return 0;
	}
}
