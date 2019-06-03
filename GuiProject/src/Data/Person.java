package Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class Person {

	private static ArrayList<Person> personenListe = new ArrayList<>();

	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	private String straﬂe;
	private String hausnummer;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStraﬂe() {
		return straﬂe;
	}

	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNachname() + ", " + getVorname() + "" + " (" + getPlz() + " " + getOrt() + ", " + getStraﬂe() + " "
				+ getHausnummer() + ")";

	}

	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}
	//

	public static void loadPersonenFromFile(String filename) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		gson.serializeNulls();
		//
		FileReader fr;
		//
		try {
			fr = new FileReader(filename);
			//

			Person[] personen = gson.fromJson(fr, Person[].class);
			personenListe = new ArrayList<Person>(Arrays.asList(personen));
			System.out.println(gson.toJson(personenListe));
		} catch (FileNotFoundException e) {
		}
		//
	}

}
