package basics;

public class AlleZahlenvon1bis1000durch6 {

	public static void main(String[] args) {
		int y = 0;
		for (int x = 1; x < 1001; x++) {
			if (x % 6 == 0)
				y++;

		}
		System.out.println(y);
	}

}
