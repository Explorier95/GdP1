/**
 * Eine Klasse fuer verschiedene Mathematische Funktionen.
 * 
 * @author Fabian Tappendorf(fabian.tappendorf@stud.th-luebeck.de)
 */
public class MyMath {

    /**
     * Diese Methode berechnet und liefert die Summe von 3 Zahlen vom Typ int.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @param n3
     *            dritte Zahl
     * @return die Summe der Zahlen
     */

    public static int summiere3Zahlen(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
	
	/**
	* Diese Methode berechnet wie viel prozent in einer Zahl steckt
	*
	* @param n1 berechnende Zahl
	*
	* @param n2 100%
	*
	*/
	
	public static double rechneProzent(double n1, double n3){
		return n1 * 100 / n3;
	}
}