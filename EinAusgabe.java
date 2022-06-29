import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 * (Die Klasse stellt Methoden fuer Ein- und Ausgaben zur Verfuegung)
 * Die Klasse beinhaltet alle benötigten Methoden für die Datumsspielereien!
 * Einsendeaufgabe beginnt bei #1.
 *
 * @author Fabian Tappenorf (fabian.tappendorf@stud.th-luebeck.de)
 * 03.05.2022
 */
 
public class EinAusgabe {

	
	/*
	* Einsendeaufgabe 
	*/
	
	// #1. Zeigt Uhrzeit und Datum an:
	
	public LocalDateTime jetzt = LocalDateTime.now(); 
	public LocalDateTime sageDatum(){
	 return this.jetzt;
	}
	
	// #2. Zeigt nur das Datum an:
	
	LocalDate heute = LocalDate.now();
	public LocalDate nurDatum(){
		return heute;
	}
	
	// #3 Prüft ob es sich bei dem aktuellen Jahr um ein Schaltjahr handelt.
	
	public String richtigFalsch(){
		if (heute.isLeapYear() == false) {
			return ("Nein, es ist kein Schaltjahr!");
		}
		return ("Ja, es ist ein Schaltjahr!");
	}
	
	// #4.1 Angabe eines Benutzerdatums
	
	LocalDate benutzerDatum;
	public LocalDate setBenutzerDatum(){
		benutzerDatum = benutzerDatum.of(2023,05,06);
		return benutzerDatum;
	}
	// #4.2 Angabe eines Benutzerdatums mithilfe eines Scanners
	
	public String scannerDate(){
		Scanner eingabeDatum;
        eingabeDatum = new Scanner(System.in);
        eingabeDatum.useDelimiter(System.lineSeparator());
		System.out.println("Bitte gebe das Jahr ein: ");
		int y = eingabeDatum.nextInt();
		System.out.println("Bitte gebe den Monat ein: ");
		int m = eingabeDatum.nextInt();
		System.out.println("Bitte gebe den Tag ein: ");
		int d = eingabeDatum.nextInt();
		
        return ("Datum: " +y +"-"+ "0"+m + "-" + "0"+d);
		
	}

	// #5 Angabe ob das Datum in der Zukunft liegt oder nicht  
	
	public String zukunft(){
		if (heute.isAfter(benutzerDatum) == false) {
			return (" -> Das Datum lieg in der Zukunft!");
		}
		return (" -> Das Datum liegt nicht in der Zukunft!");
	}
	
	/*
	*****************************
	* Ende Einsendeaufgabe OBJ #*
	*****************************
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	*
	/*
	/**
    * Die Methode schreibt zwei Leerzeilen auf die Konsole
    */
	
    public static void schreibeZweiLeerzeilen() {
        System.out.println();
        System.out.println();
    }
	
    /**
     * schreibt eine Linie auf die Konsole
     */
    public static void schreibeLinie() {
        System.out
                .println("--------------------------------------------------");
    }

    /**
     * schreibt eine Begruessung des aktuellen Benutzers auf den Bildschirm
     */
    public static void schreibeBegruessung() {
        String name = System.getProperty("user.name");
        System.out.println("Hallo liebe/r " + name);
    }

    /**
     * Die Methode schreibt eine Ausgabezeile fuer den Umfang auf die Konsole
     * 
     * @param aussen der auszugebende Aussenumfang eines Dreiecks
     */
    public static void schreibeUmfangAufDieKonsole(double aussen) {
        EinAusgabe.schreibeLinie();
        System.out.println("Der Umfang des kompletten Dreiecks betraegt: "
                + Dreieck.rundeDouble(aussen, 2));
        EinAusgabe.schreibeLinie();
    }

    /**
     * schreibt die beiden Seitenwinkel eines Dreiecks auf die Konsole
     * 
     * @param winkelAlpha Winkel alpha
     * @param winkelBeta  Winkel beta
     */
    public static void ausgebenWinkel(double winkelAlpha, double winkelBeta) {
        System.out.println("Alpha: " + Dreieck.rundeDouble(winkelAlpha, 2));
        System.out.println("Beta: " + Dreieck.rundeDouble(winkelBeta, 2));
        EinAusgabe.schreibeLinie();
    }

    /**
     * schreibt die Bezeichnung und den angegebenen Winkel auf die Konsole
     * 
     * @param bezeichnung Name des Winkels
     * @param winkel      auszugebender Winkel
     */
    public static void ausgebenWinkel(String bezeichnung, double winkel) {
        System.out.println(bezeichnung + ": " + Dreieck.rundeDouble(winkel, 2));
    }

    /**
     * liest ein Zeichen von den Nutzenden ein
     * 
     * @param aufforderung Text, der als Eingabeaufforderung auf der Konsole
     *                     erscheinen soll
     * @return von den Nutzenden eingegebenes Zeichen
     */
    public static char eingabeZeichen(String aufforderung) {
        Scanner tastatur;
        tastatur = new Scanner(System.in);
        tastatur.useDelimiter(System.lineSeparator());

        System.out.print(aufforderung);
        char zeichen = tastatur.next().charAt(0);
        return zeichen;
    }

    /**
     * liest eine Zahl von den Nutzenden ein
     * 
     * @param aufforderung Text, der als Eingabeaufforderung auf der Konsole
     *                     erscheinen soll
     * @return von den Nutzenden eingegebene Zahl
     */
    public static double eingabeKommazahl(String aufforderung) {
        Scanner tastatur;
        tastatur = new Scanner(System.in);
        tastatur.useDelimiter(System.lineSeparator());

        System.out.print(aufforderung);
        double zahl = tastatur.nextDouble();
        return zahl;
    }

    /**
     * liest eine Zahl von den Nutzenden ein
     * 
     * @param aufforderung Text, der als Eingabeaufforderung auf der Konsole
     *                     erscheinen soll
     * @return von den Nutzenden eingegebene Zahl
     */
    public static int eingabeGanzeZahl(String aufforderung) {
        Scanner tastatur;
        tastatur = new Scanner(System.in);
        tastatur.useDelimiter(System.lineSeparator());

        System.out.print(aufforderung);
        int zahl = tastatur.nextInt();
        return zahl;
    }

    /**
     * gibt eine formatierte Ausgabe des Uhrzeit-Objekts zeit zurueck
     * 
     * @param zeit das Uhrzeit-Objekt
     * @return ein String im Format hh:mm
     */
    public static String zeitFormatiert(LocalDateTime zeit) {
        DateTimeFormatter f = DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT);
        return f.format(zeit);
    }

    /**
     * liest einen Text von den Nutzenden ein
     * 
     * @param aufforderung Text, der als Eingabeaufforderung auf der Konsole
     *                     erscheinen soll
     * @return von den Nutzenden eingegebener Text
     */
    public static String eingabeText(String aufforderung) {
        Scanner tastatur;
        tastatur = new Scanner(System.in);
        tastatur.useDelimiter(System.lineSeparator());

        System.out.print(aufforderung);
        String text = tastatur.next();
        return text;
    }

    /**
     * schreibt eine Analyse des uebergebenen Zeichens auf die Konsole
     * 
     * @param zeichen
     */
    public static void zeichenanalyse(char zeichen) {
        System.out.println("Buchstabe: " + Character.isLetter(zeichen));
        System.out.println("Ziffer: " + Character.isDigit(zeichen));
        System.out.println("Steuerzeichen: " + Character.isISOControl(zeichen));
        System.out.println(
                "als Grossbuchstabe: " + Character.toUpperCase(zeichen));
        System.out.println(
                "als Kleinbuchstabe: " + Character.toLowerCase(zeichen));
    }
}