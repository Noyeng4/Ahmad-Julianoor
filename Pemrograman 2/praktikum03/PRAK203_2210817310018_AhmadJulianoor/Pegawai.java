package praktikum03.PRAK203_2210817310018_AhmadJulianoor;
// Employee diganti menjadi Pegawai
// public Employee {
public class Pegawai {
    public String nama;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Menambahkan parameter j
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
    //Menambahkan setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}