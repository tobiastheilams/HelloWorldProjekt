package basics;

public class WhileSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl1 = 300;
		int zahl2 = zahl1;

		while (zahl2 > 0) {
			if (zahl1 % zahl2 == 0) {
				System.out.println(zahl2);
			}
			zahl2 = zahl2 - 1;
		}
	}
}