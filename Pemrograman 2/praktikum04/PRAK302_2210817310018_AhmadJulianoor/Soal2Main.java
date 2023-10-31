package praktikum04.PRAK302_2210817310018_AhmadJulianoor;
import java.util.Scanner;
import java.util.LinkedList;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahNegara = input.nextInt();
        input.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<Negara>();

        for (int i = 0; i < jumlahNegara; i++) {
            String namaNegara = input.nextLine();

            String jenisKepemimpinan = input.nextLine();

            String namaPemimpin = input.nextLine();

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                bulanKemerdekaan = input.nextInt();
                tahunKemerdekaan = input.nextInt();
            }
            input.nextLine();
            Negara negara = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.print("Negara " + negara.getNama() + " mempunyai ");
            if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Raja bernama " + negara.getNamaPemimpin());
                System.out.println();
            } else {
                System.out.println("Presiden bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan());
                System.out.println();
            }
        }
    }
}