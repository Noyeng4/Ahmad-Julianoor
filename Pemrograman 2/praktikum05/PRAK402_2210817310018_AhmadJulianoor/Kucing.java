package praktikum05.PRAK402_2210817310018_AhmadJulianoor;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    public Kucing (String n, String r, String wb){
        super.nama = n;
        super.ras = r;
        this.warnaBulu = wb;
    }
    public void displayKucing(){
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : "+nama);
        System.out.println("Dengan ras: "+ras);
        System.out.println("Memiliki warna bulu: "+warnaBulu);
    }
}
