package praktikum0;
import java.util.Scanner;
public class PRAK005_2210817310018_AhmadJulianoor {
    public static void main(String[] args) {
        String favFood, Hobby;
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit : ");
        favFood = myObj.nextLine();
        System.out.print("Masukan Hobi : ");
        Hobby = myObj.nextLine();
        System.out.print("Aku suka makan " + favFood + ", dan Hobiku " + Hobby);
    }
}
