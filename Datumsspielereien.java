/**
 * Beschreibung: Ein Programm zur Zeitangabe so wie der Angabe von Schaltjahren.
 *
 * @author Fabian Tappendorf (fabian.tappendorf@stud.th-luebeck.de)
 * @version 03.05.2022
 */
public class Datumsspielereien {

    /**
     * Die main-Methode fuer die Einsendeaufgabe OBJ.
     * Diese Methode dient der Prüfung, der in der Klasse EinAusgabe geschriebenen Methoden.
     *
     */
    public static void main(String[] args) {
	   
	   
	   EinAusgabe date;
	   date = new EinAusgabe();
	   
	// #1   
	   System.out.println("Das heutige Datum und die aktuelle Uhrzeit: " + date.sageDatum());
	// #2
	   System.out.println("Das heutige Datum: " + date.nurDatum());
	   System.out.println("Wir schreiben das Jahr " + date.heute.getYear() + ".");
	//#3
	   System.out.println("Ist es ein Schaltjahr? : "+ date.richtigFalsch());
	   System.out.println("In diesem Monat gibt es " + date.heute.lengthOfMonth() + " Tage");
	   
	// #4.1 Benutzerdefiniertes Datum ohne Scanner
	   System.out.println(date.setBenutzerDatum());
	   
	// #4.2 Benutzerdefiniertes Datum mit Scanner (Freiwillige Aufgabe)
		System.out.println(date.scannerDate());
		date.schreibeLinie();
		
	// #5 Datum in der Zukunft oder nicht? 	
		System.out.println(date.benutzerDatum + date.zukunft());
		
	// #6 Eine Woch nach dem Benutzerdatum und dem jetzigem Datum
		System.out.println("Datum in einer Woche nach dem Benutzerdatum: " + date.benutzerDatum.plusWeeks(1));
		System.out.println("Datum in einer Woche nach dem jetzigem Datum: " + date.heute.plusWeeks(1));
    } 

} 