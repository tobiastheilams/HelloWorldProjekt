package basics;

public class EinMalEins {
	//
	// Kleines Ein mal Eins
	// \t = Tabulator (Abstand)
	// \n = neue Linie - System.out.println(); = System.out.print("\n")
	//
	public static void main(String[] args) {
		for (int x = 1; x < 11; x++) {
			System.out.print(x + "er Reihe:\t");
			
			
			for (int y = 1; y < 11; y++) {
				System.out.print(x * y);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}