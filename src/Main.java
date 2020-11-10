/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program mencari massa jenis kubus
 * dengan konsep OOP
 */

public class Main {
    public static void main (String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);

        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        System.out.print("\n");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
}
