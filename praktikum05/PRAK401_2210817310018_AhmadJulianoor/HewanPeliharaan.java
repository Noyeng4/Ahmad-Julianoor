package praktikum05.PRAK401_2210817310018_AhmadJulianoor;
import java.util.Scanner;
public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }
    public static HewanPeliharaan ScanHewan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        return new HewanPeliharaan(nama,ras);
    }
    void display() {
        System.out.println("Detail Nama Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}