package Rekursion;

public class rekursion {

	public static void main(String[] args) {
		ausgabe1(5000);
		
	}

	public static void ausgabe1(int zahl) {
		//das ist eine Rekursion
		//das ist die Abbruchbdingung
		if (zahl == 0)
			return;
		//
	zahl = zahl / 3;
		System.out.println(zahl);
	//rekursiver Aufruf
		ausgabe1(zahl);

	}
}