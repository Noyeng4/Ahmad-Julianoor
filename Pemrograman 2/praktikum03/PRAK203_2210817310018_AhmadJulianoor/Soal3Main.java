package praktikum03.PRAK203_2210817310018_AhmadJulianoor;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Menambahkan titik koma pada baris ini
        //p1.nama ="roi"
        p1.nama = "Roi";
        p1.asal = ("Kingdom of Orvel");
        p1.setJabatan("Assassin");
        //Menambahkan setter untuk umur
        p1.setUmur(17);

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}
