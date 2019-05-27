package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Data.Person;

import org.eclipse.swt.widgets.Label;

public class Myfirstwindow {

	protected Shell shlFrWindow;
	private Text VornameTF;
	private Label lblNachname;
	private Label lblVorname;
	private Text NachnameTF;
	private Label lblPlz;
	private Label lblOrt;
	private Label lblStrae;
	private Label lblHausnummer;
	private Text PLZTF;
	private Text OrtTF;
	private Text StraﬂeTF;
	private Text HausnummerTF;
	private Label PLZOut;
	private Label OrtOut;
	private Label StraﬂeOut;
	private Label HausnummerOut;
	private Label VornameOut;
	private Label NachnameOut;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Myfirstwindow window = new Myfirstwindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setSize(450, 300);
		shlFrWindow.setText("FR Window\r\n");

		Button button1 = new Button(shlFrWindow, SWT.NONE);
		button1.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				// System.out.println("Maus ¸ber Knopf bewegt");
				//
				// System.out.println("Maus auf: " + me.x + "/" + me.y);
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knopf gedr¸ckt");
				//
				System.out.println(VornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				System.out.println(StraﬂeTF.getText());
				System.out.println(HausnummerTF.getText());

				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
				getPLZOut().setText(getPLZTF().getText());
				getOrtOut().setText(getOrtTF().getText());
				getStraﬂeOut().setText(getStraﬂeTF().getText());
				getHausnummerOut().setText(getHausnummerTF().getText());

			}

		});
		button1.setBounds(31, 21, 75, 25);
		button1.setText("Mein 1. Knopf");

		VornameTF = new Text(shlFrWindow, SWT.BORDER);
		VornameTF.setBounds(103, 77, 76, 21);

		lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(30, 107, 63, 15);
		lblNachname.setText("Nachname");

		lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(31, 80, 55, 15);
		lblVorname.setText("Vorname");

		NachnameTF = new Text(shlFrWindow, SWT.BORDER);
		NachnameTF.setBounds(103, 104, 76, 21);

		lblPlz = new Label(shlFrWindow, SWT.NONE);
		lblPlz.setBounds(31, 138, 55, 15);
		lblPlz.setText("PLZ");

		lblOrt = new Label(shlFrWindow, SWT.NONE);
		lblOrt.setBounds(31, 172, 55, 15);
		lblOrt.setText("Ort");

		lblStrae = new Label(shlFrWindow, SWT.NONE);
		lblStrae.setBounds(31, 203, 55, 15);
		lblStrae.setText("Stra\u00DFe");

		lblHausnummer = new Label(shlFrWindow, SWT.NONE);
		lblHausnummer.setBounds(10, 230, 82, 15);
		lblHausnummer.setText("Hausnummer");

		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(103, 135, 76, 21);

		OrtTF = new Text(shlFrWindow, SWT.BORDER);
		OrtTF.setBounds(103, 169, 76, 21);

		StraﬂeTF = new Text(shlFrWindow, SWT.BORDER);
		StraﬂeTF.setText("");
		StraﬂeTF.setBounds(103, 200, 76, 21);

		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(103, 227, 76, 21);

		VornameOut = new Label(shlFrWindow, SWT.NONE);
		VornameOut.setBounds(267, 80, 55, 15);

		NachnameOut = new Label(shlFrWindow, SWT.NONE);
		NachnameOut.setBounds(267, 107, 55, 15);

		PLZOut = new Label(shlFrWindow, SWT.NONE);
		PLZOut.setBounds(267, 138, 55, 15);

		OrtOut = new Label(shlFrWindow, SWT.NONE);
		OrtOut.setBounds(267, 172, 55, 15);
		OrtOut.setText("");

		StraﬂeOut = new Label(shlFrWindow, SWT.NONE);
		StraﬂeOut.setBounds(267, 203, 107, 15);

		HausnummerOut = new Label(shlFrWindow, SWT.NONE);
		HausnummerOut.setBounds(267, 230, 55, 15);
		HausnummerOut.setText("");

		Button btnSaveClean = new Button(shlFrWindow, SWT.NONE);
		btnSaveClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p; // Variablen-Definition
				p = new Person(); // Variablen-Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				p.setPlz(getPLZTF().getText());
				p.setOrt(getOrtTF().getText());
				p.setStraﬂe(getStraﬂeTF().getText());
				p.setHausnummer(getHausnummerTF().getText());
				//
				System.out.println("------------");
				System.out.println("Objekt");
				System.out.println(p);
				//
				Person.getPersonenListe().add(p);
				//
				System.out.println("------------");
				System.out.println("Liste");
				System.out.println(Person.getPersonenListe());
				//
				// finally clean fields
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getPLZTF().setText("");
				getOrtTF().setText("");
				getStraﬂeTF().setText("");
				getHausnummerTF().setText("");
				//
			}
		});
		btnSaveClean.setBounds(178, 21, 89, 25);
		btnSaveClean.setText("Save and Clean");
		
		Button btnNewButton = new Button(shlFrWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				gson.serializeNulls();
				//
				String jsonString = gson.toJson(Person.getPersonenListe());
				System.out.println(jsonString);
				//
			try {
				FileWriter fw = new FileWriter(File.createTempFile("wpfjson", " .json"));
				//
		       gson.toJson(Person.getPersonenListe(),fw);
		       //
		       fw.flush();
		       fw.close();
		       
			} catch (Exception ex) {
				
			}
			}
		});
		btnNewButton.setBounds(299, 7, 89, 53);
		btnNewButton.setText("to Json");

	}

	public Label getVornameOut() {
		return VornameOut;
	}

	public Label getNachnameOut() {
		return NachnameOut;
	}

	public Label getPLZOut() {
		return PLZOut;
	}

	public Label getOrtOut() {
		return OrtOut;
	}

	public Label getStraﬂeOut() {
		return StraﬂeOut;
	}

	public Label getHausnummerOut() {
		return HausnummerOut;
	}

	public Text getHausnummerTF() {
		return HausnummerTF;
	}

	public Text getStraﬂeTF() {
		return StraﬂeTF;
	}

	public Text getOrtTF() {
		return OrtTF;
	}

	public Text getPLZTF() {
		return PLZTF;
	}

	public Text getNachnameTF() {
		return NachnameTF;
	}

	public Text getVornameTF() {
		return VornameTF;
	}
}
