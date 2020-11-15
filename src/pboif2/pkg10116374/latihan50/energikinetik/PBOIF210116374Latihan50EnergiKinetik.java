package pboif2.pkg10116374.latihan50.energikinetik;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan proses menghitung energi kinetik
 *
 */
public class PBOIF210116374Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik energi = new EnergiKinetik();
        energi.setMassa(145);
        energi.setKecepatan(25);
        System.out.println("====Program Penghitung Energi Kinetik====");
        System.out.println("Massa Baseball = " + energi.getMassa() + " gram");
        System.out.println("Kecepatan = " + energi.getKecepatan() + " m/s");
        System.out.println("Energi Kinetik = " + energi.hitungEnergiKinetik() + " Joule");
        System.out.println("Usaha = " + energi.hitungUsaha()+ " Joule");
    }
    
}
