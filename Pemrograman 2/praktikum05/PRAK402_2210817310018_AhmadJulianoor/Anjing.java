package praktikum05.PRAK402_2210817310018_AhmadJulianoor;
import java.util.Arrays;
public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String wb, String[] k){
        super.nama = n;
        super.ras = r;
        this.warnaBulu = wb;
        this.kemampuan = k;
    }
    public void displayAnjing(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan Peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[","").replace("]","").replace(",",""));
    }
}
