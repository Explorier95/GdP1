
public class EinfachesAutoTest {

    public static void main(String[] args) {

        EinfachesAuto a = new EinfachesAuto("qbc", "def", "edg", 2012, 120, 12);
        System.out.println(a.getAlter());
        System.out.println(a);

        ErweitertesAuto b = new ErweitertesAuto("Rudolf","BMW","Lila",2022,500,1,"Hamburg","ABC1212");
        System.out.println(b.setzeNeuesZiel("Kiel",120));
        System.out.println(b.getAlter());
        System.out.println(b.getClass());
        //System.out.println(b);
        System.out.println(b.toString());

    }

}
