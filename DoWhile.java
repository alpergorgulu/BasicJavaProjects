import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int i=0;

        do {
            System.out.println("i= "+ i);
            i++;
        }while(i<5);

        System.out.println("*********************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");

        int sayi = scanner.nextInt();

        int toplam = 0;

        do {
            toplam += sayi %10;

            sayi /=10;
            System.out.println("Sayı " + sayi);
            }while (sayi>0);

        System.out.println(("Rakamların Toplamı: " + toplam));



    }
}