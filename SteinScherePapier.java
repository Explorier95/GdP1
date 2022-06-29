import java.util.Random;
import java.util.Scanner;

/**
 * Diese Klasse realisiert ein Stein-Schere-Papier Spiel. Der Benutzer waehlt
 * ueber die Konsole eines der drei Symbole. Gespielt wird gegen den Computer,
 * fuer diesen wird ein Symbol automatisch festgelegt. Der Gewinner des Matches
 * wird ermittelt und auf der Konsole ausgegeben.
 * Beim Erzeugen eines Objektes wird die Anzahl der Matches oder Runden
 * festgelegt.
 *
 * @author Fabian Tappendorf, Fabian.tappendorf@stud.th-luebeck.de
 * Einsendeaufgabe SEQ
 *
 */

public class SteinScherePapier {
  // alle SteinScherePapier Objekt teilen diese 3 Attribute
  private static final int STEIN = 1;
  private static final int SCHERE = 2;
  private static final int PAPIER = 3;

  private int anzahlRunden;

  /**
   * Erzeugt ein SteinScherePapier-Objekt, das einem Mensch gegen dem Computer
   * anzahlRunden Mal zu spielen.
   *
   * @param anzahlRunden
   *            Anzahl der Runden die Mensch und Computer spielen
   */
  public SteinScherePapier(int anzahlRunden) {
      this.anzahlRunden = anzahlRunden;
  }

  /**
   * Diese Methode ermittelt den Gewinner anhand der Symbol-Auswahl des
   * Benutzers und des Computers. Haben beide das gleiche Symbol gewaehlt, so
   * wird "Unentschieden" ausgegeben. Schlaegt der Computer den Benutzer wird
   * "Sie haben leider verloren!" ausgegeben. Hat der Benutzer den Computer
   * geschlagen wird entsprechend "Herzlichen Glueckwunsch! Sie haben
   * gewonnen!" ausgegeben.
   *
   * @param benutzerAuswahl
   *            numerischer Wert der Auswahl des Benutzers bspw. 1 fuer Stein
   * @param computerAuswahl
   *            numerischer Wert der Auswahl des Computers bspw. 2 fuer Schere
   *#1 Der Einsendeaufgabe SEQ
   */
   
  private String gewinnerErmitteln(int benutzerAuswahl, int computerAuswahl) {
	  
	  if (computerAuswahl == 1 && benutzerAuswahl == 1){
			return "Unendschieden!";
		}else if (computerAuswahl == 1 && benutzerAuswahl == 2){
			return "Sie haben leider verloren!";
		}else if (computerAuswahl == 1 && benutzerAuswahl == 3){
			return "Herzlichen Glueckwunsch! Sie haben gewonnen!";
	    }else if (computerAuswahl == 2 && benutzerAuswahl == 1){
			return "Herzlichen Glueckwunsch! Sie haben gewonnen!";
		}else if (computerAuswahl == 2 && benutzerAuswahl == 2){
			return "Unendschieden!";
		}else if (computerAuswahl == 2 && benutzerAuswahl == 3){
			return "Sie haben leider verloren!";
		}else if (computerAuswahl == 3 && benutzerAuswahl == 1){
			return "Sie haben leider verloren!";
		}else if (computerAuswahl == 3 && benutzerAuswahl == 2){
			return "Herzlichen Glueckwunsch! Sie haben gewonnen!";
		}else if(computerAuswahl == 3 && benutzerAuswahl == 3){
			return "Unendschieden!";
		}
		return "Programm wird beendet!";
  }

  
  /**
   * Startet das SteinScherePapier Spiel. Die Anzahl der Runden die gespielt
   * werden, ist ueber ein Konstruktor-Argument festgelegt. Der Benutzer wird
   * um eine Auswahl gebeten. Danach wird ueber einen Zufallszahlen-Generator
   * eine Auswahl fuer den Computer bestimmt. Ein Aufruf von
   * gewinnerErmitteln(int benutzerAuswahl, int computerAuswahl) bestimmt wer
   * die jeweilige Runde gewonnen hat.
   */
  private void start() {
  			Scanner sc = new Scanner(System.in);
      int gespielteRunden = 0;
      while (gespielteRunden < anzahlRunden) {

          // Auswahl des Benutzers
      			System.out.print("Bitte waehlen Sie Stein(1), Schere(2), Papier(3): ");
          int benutzerAuswahl = sc.nextInt();

          // Auswahl des Computers
          int computerAuswahl = new Random().nextInt(3) + 1;

          // Ausgabe der gewahlten Symbole
          System.out.println("Ihre Auswahl: "
                  + auswahlErmitteln(benutzerAuswahl));
          System.out.println("Computer Auswahl: "
                  + auswahlErmitteln(computerAuswahl));

          // Ermittlung des Gewinners
          String ergebnis = gewinnerErmitteln(benutzerAuswahl, computerAuswahl);

          System.out.println(ergebnis);

          // Inkrementieren des Zaehlers fuer die Rundenanzahl
          gespielteRunden++;
      }
      sc.close();
  }

  /**
   * Ermittelt die Auswahl des jeweiligen Symbols anhand des Wertes des
   * Symbols.
   *
   * @param auswahl
   *            numerischer Wert der jeweiligen Auswahl bspw. 1
   * @return Beschreibung der jeweiligen Auswahl bspw. Stein (1)
   */
  private String auswahlErmitteln(int auswahl) {
      if (auswahl == STEIN) {
          return "Stein (1)";
      } else if (auswahl == SCHERE) {
          return "Schere (2)";
      } else if (auswahl == PAPIER) {
          return "Papier (3)";
      } else {
          return "Ungueltige Auswahl (" + auswahl + ")";
      }
  }

  // Start des Spiels
  public static void main(String[] args) {
      SteinScherePapier steinScherePapier = new SteinScherePapier(3);
      steinScherePapier.start();
  }

}