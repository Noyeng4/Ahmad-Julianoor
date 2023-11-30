package praktikum2.PRAK202_2210817310018_AhmadJulianoor;
public class Kopi {
    public String namaKopi;
    public String ukuran;
    public int harga;
    public String pembeli;
    public Kopi() {
    }
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
    public void setPembeli(String namaPembeli) {
        pembeli = namaPembeli;
    }
    public String getPembeli() {
        return pembeli;
    }
    public double getPajak() {
        double pajak = harga * 0.11;
        return pajak;
    }
}