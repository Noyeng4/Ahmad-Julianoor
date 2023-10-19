package praktikum03.PRAK201_2210817310018_AhmadJulianoor;
public class Buah {
    private String nama;
    private double hargaPerKg;
    private double berat;
    private double jumlahBeli;

    public Buah(String nama, double hargaPerKg, double berat, double jumlahBeli) {
        this.nama = nama;
        this.hargaPerKg = hargaPerKg;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;
    }

    public void cetakDetail() {
        double hargaSebelumDiskon = hargaPerKg * jumlahBeli;
        double jmlhBeli = berat * jumlahBeli;
        int potonganHarga = (int)(jmlhBeli / 4);
        double diskon = potonganHarga * (hargaPerKg * 4 * 0.02);
        double hargaSetelahDiskon = hargaSebelumDiskon - diskon;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: Rp" + hargaPerKg);
        System.out.println("Jumlah Beli: " + jmlhBeli + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon));
        System.out.println("Total Diskon: Rp" + diskon);
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSetelahDiskon));
        System.out.println();
    }
}
