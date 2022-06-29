/**
 * Testprogramm fuer die Klasse MyMath.
 * 
 * @author Fabian Tappendorf(fabian.tappendorf@stud.th-luebeck.de)
 */
public class MyMathTest {

    /**
     * Main-Method zum Starten und Testen der Klasse MyMath. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
    public static void main(String[] args) {
        // Statische Methoden der Klasse MyMath testen
        System.out.println("Summe von 1,2,3: "
                + MyMath.summiere3Zahlen(1, 2, 3));
        System.out.println("Summe von -1,-2,3: "
                + MyMath.summiere3Zahlen(-1, -2, 3));
		System.out.println("250 ist " + MyMath.rechneProzent(250,500) + "% von 500");
    }
}