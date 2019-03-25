package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class Myfirstwindow {

	protected Shell shlFrWindow;
	private Text vorname;
	private Label lblNachname;
	private Label lblVorname;
	private Text nachname;
	private Label lblPlz;
	private Label lblOrt;
	private Label lblStrae;
	private Label lblHausnummer;
	private Text PLZ;
	private Text Ort;
	private Text Straﬂe;
	private Text Hausnummer;

	/**
	 * Launch the application.
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
			System.out.println("Maus ¸ber Knopf bewegt");
			//
			System.out.println("Maus auf: " + me.x +"/" +me.y);
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knopf gedr¸ckt");
				//
				System.out.println(vorname.getText());
				System.out.println(nachname.getText());
				System.out.println(PLZ.getText());
				System.out.println(Ort.getText());
				System.out.println(Straﬂe.getText());
				System.out.println(Hausnummer.getText());
				}
			
		});
		button1.setBounds(31, 21, 75, 25);
		button1.setText("Mein 1. Knopf");
		
		vorname = new Text(shlFrWindow, SWT.BORDER);
		vorname.setBounds(103, 77, 76, 21);
		
		lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(31, 117, 55, 15);
		lblNachname.setText("Nachname");
		
		lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(31, 80, 55, 15);
		lblVorname.setText("Vorname");
		
		nachname = new Text(shlFrWindow, SWT.BORDER);
		nachname.setBounds(103, 114, 76, 21);
		
		lblPlz = new Label(shlFrWindow, SWT.NONE);
		lblPlz.setBounds(31, 151, 55, 15);
		lblPlz.setText("PLZ");
		
		lblOrt = new Label(shlFrWindow, SWT.NONE);
		lblOrt.setBounds(31, 172, 55, 15);
		lblOrt.setText("Ort");
		
		lblStrae = new Label(shlFrWindow, SWT.NONE);
		lblStrae.setBounds(31, 203, 55, 15);
		lblStrae.setText("Stra\u00DFe");
		
		lblHausnummer = new Label(shlFrWindow, SWT.NONE);
		lblHausnummer.setBounds(31, 236, 55, 15);
		lblHausnummer.setText("Hausnummer");
		
		PLZ = new Text(shlFrWindow, SWT.BORDER);
		PLZ.setBounds(103, 151, 76, 21);
		
		Ort = new Text(shlFrWindow, SWT.BORDER);
		Ort.setBounds(103, 172, 76, 21);
		
		Straﬂe = new Text(shlFrWindow, SWT.BORDER);
		Straﬂe.setText("");
		Straﬂe.setBounds(103, 203, 76, 21);
		
		Hausnummer = new Text(shlFrWindow, SWT.BORDER);
		Hausnummer.setBounds(103, 236, 76, 21);

	}
}
