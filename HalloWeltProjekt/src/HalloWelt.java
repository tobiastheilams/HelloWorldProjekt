import java.util.function.DoubleToLongFunction;

public class HalloWelt {

	public static void main(String[] args) {
		System.out.println("Hallo WIN 18 19");
		// Kommentar
		// Ausgabe Text hat immer ""
		System.out.println("1");
		// Zahlen brauchen kein ""
		System.out.println(1);
		// Unterschied zwischen 1+1 und "1+1"
		System.out.println(1 + 1);
		System.out.println("1+1");
		//
		System.out.println(1 + 1 + "=2");
		System.out.println("1+1=" + 1 + 1);
		//
		System.out.println(1 + 1);
		System.out.println(2 - 1);
		System.out.println(2 * 3);
		System.out.println(4 / 2);
		//
		System.out.println(9 / 4);
		System.out.println(9 / 4.0);
		// kleinste Variable - Wertebereich 0 | 1 . true | false
		boolean booleanVariable = true;
		// boolean Variablen-Typ
		// booleanVariable = Name der Variable
		// = Wertzuweisung
		// true ist der Wert den die Variable hat
		System.out.println(booleanVariable);
		// geht nur einmal
		// boolean booleanVariable = false;
		// aber Werte können mehrfach zugewiesen werden
		booleanVariable = false;
		System.out.println(booleanVariable);
		//
		//
		byte byteVariable = 71;
		System.out.println(byteVariable);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//
		char charVariable = 'x';
		System.out.println(charVariable);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		// String - mehrere chars verkettet
		String stringVariable = "stringWert";
		System.out.println(stringVariable);
		System.out.println(stringVariable.length());
		System.out.println(stringVariable.charAt(5));
		//
		// Zahlen
		// short - 16bit - -32.786 bis 32.767
		short shortVariable = 236;
		System.out.println(shortVariable);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		// int - 32bit -
		int intVariable = 2345678;
		System.out.println(intVariable);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// long 64bit
		long longVariable = 1234567890;
		System.out.println(longVariable);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		// float 32 bit
		float floatVariable = 123.456F;
		System.out.println(floatVariable);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		// double 64bit
		double doubleVariable = 123.456789;
		System.out.println(doubleVariable);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
	

	}
}
