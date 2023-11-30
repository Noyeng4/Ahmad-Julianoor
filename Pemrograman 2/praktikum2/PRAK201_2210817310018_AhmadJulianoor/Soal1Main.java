package praktikum2.PRAK201_2210817310018_AhmadJulianoor;

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 7000, 0.4, 100);
        Buah mangga = new Buah("Mangga", 3500, 0.2, 75);
        Buah alpukat = new Buah("Alpukat", 10000, 0.25, 48);

        apel.cetakDetail();
        mangga.cetakDetail();
        alpukat.cetakDetail();
    }
}