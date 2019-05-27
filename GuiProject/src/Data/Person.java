package Data;

import java.util.ArrayList;

import com.google.gson.JsonElement;

public class Person {
	
	private static ArrayList<Person> personenListe = new ArrayList<>();
		
	

	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	private String stra�e;
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

	public String getStra�e() {
		return stra�e;
	}

	public void setStra�e(String stra�e) {
		this.stra�e = stra�e;
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
		return getNachname() + ", " + getVorname() + "" + " (" + getPlz() + " " + getOrt() + ", " + getStra�e() + " "
				+ getHausnummer() + ")";

	}

	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}

	
}
