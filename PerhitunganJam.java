package perhitunganjam;

/**
 *
 * @author cAROLINE
 */
public class PerhitunganJam {

    public static void main(String[] args) {
        Jam waktu = new Jam();
        Jam waktu1 = new Jam(5, 1, 59);
        System.out.println(waktu.convertJamToDetik(20));
        System.out.println(waktu.convertJamToDetik(1));
        System.out.println(waktu.convertJamToMenit(2));
        System.out.println(waktu.convertMenitToDetik(2));
        System.out.println(waktu.convertDetikToMenit(60));
        System.out.println(waktu.convertDetikToJam(18000));
    }

}
