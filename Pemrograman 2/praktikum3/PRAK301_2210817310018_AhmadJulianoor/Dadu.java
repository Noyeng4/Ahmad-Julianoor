package praktikum3.PRAK301_2210817310018_AhmadJulianoor;
import java.util.Random;

class Dadu {
    private int nilai;

    public Dadu() {
        Random rand = new Random();
        nilai = rand.nextInt(6) + 1;
    }
    public int getNilai() {
        return nilai;
    }
}