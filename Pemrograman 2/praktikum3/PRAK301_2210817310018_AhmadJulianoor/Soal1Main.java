package praktikum3.PRAK301_2210817310018_AhmadJulianoor;
import java.util.Scanner;
import java.util.LinkedList;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahDadu = input.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<Dadu>();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
        }
        int totalNilai = 0;
        for (Dadu dadu : daduList) {
            totalNilai += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}