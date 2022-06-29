/**
 * @Autor Fabian Tappendorf
 * Beschreibung: Eine Klasse zur erweiterung der Klasse EinfachesAuto.java
 */
public class ErweitertesAuto extends EinfachesAuto {

    protected String standort;
    protected String fahrgestellnummer;

    protected String ziel;

    protected int entfernung;

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
    public ErweitertesAuto(String besitzer, String autotyp, String farbe, int erstzulassung, int leistung, int kmStand, String standort, String fahrgestellnummer)  {
        super(besitzer, autotyp, farbe, erstzulassung, leistung, kmStand);
        this.standort = standort;
        this.fahrgestellnummer = fahrgestellnummer;
    }

    /**
     *
     * @param ziel
     * Gibt das ziel der Fahrt an.
     * @param entfernung
     * Gibt die entfernung vom Standort zum Ziel an.
     */
    public String setzeNeuesZiel(String ziel, int entfernung){
        this.ziel = ziel;
        this.entfernung = entfernung;
        return "Die Fahrt von " + standort + " nach " + ziel + " betraegt " + entfernung + " Km." ;

    }

    @Override
    public String toString(){
        return "[Besitzer=" + this.besitzer + ", Autotyp=" + this.autotyp
                + ", Farbe=" + this.farbe + ", Erstzulassung="
                + this.erstzulassung + ", Leistung=" + this.leistung
                + ", KmStand=" + this.kmStand +
                "Standort=" + this.standort +", Fahrgestellnummer="+ this.fahrgestellnummer + "]";
    }

}
