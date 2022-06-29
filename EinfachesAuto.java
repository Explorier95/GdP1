import java.time.LocalDate;

/**
 * Klasse zum Erzeugen von Auto Objekten.
 * 
 * @author Sandra Kaltofen
 * @version 1.03, 07/2020
 */

public class EinfachesAuto {

    // Instanzvariablen
    protected String besitzer;
    protected String autotyp;
    protected String farbe;
    protected int erstzulassung;
    protected int leistung;
    protected int kmStand;

    /**
     * Konstruktor fuer die Klasse EinfachesAuto
     * 
     * @param besitzer      Name des Autobesitzers
     * @param autotyp       Typ des Autos
     * @param farbe         Farbe des Autos
     * @param erstzulassung Jahreszahl der Autozulassung
     * @param leistung      PS-Zahl des Autos
     * @param kmStand       Kilometerstand des Autos
     */

    public EinfachesAuto(String besitzer, String autotyp, String farbe,
            int erstzulassung, int leistung, int kmStand) {
        this.besitzer = besitzer;
        this.autotyp = autotyp;
        this.farbe = farbe;
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        this.kmStand = kmStand;
    }

    /**
     * Die Methode getAlter() dient zur Errechnung des Autoalters ueber die
     * Erstzulassung.
     * 
     * @return int: Alter des Autos
     */
    public int getAlter() {
        // Ermittlung des aktuellen Jahres
        int aktuellesJahr = LocalDate.now().getYear();
        return aktuellesJahr - this.erstzulassung;
    }

    /**
     * Die Methode meldung() gibt die Attribute "farbe" und "besitzer" auf der
     * Standardausgabe aus.
     */
    public void meldung() {
        System.out.print("Hier gruesst das " + this.farbe + "e ");
        System.out.println("Auto von " + this.besitzer);
    }

    @Override
    public String toString() {
        return "[Besitzer=" + this.besitzer + ", Autotyp=" + this.autotyp
                + ", Farbe=" + this.farbe + ", Erstzulassung="
                + this.erstzulassung + ", Leistung=" + this.leistung
                + ", KmStand=" + this.kmStand + "]";
    }

}
