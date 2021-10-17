import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz");
        int sayi = scanner.nextInt();

        int faktoriyel = 1 ;
        while (sayi > 0) {

            faktoriyel *= sayi;
            sayi--;

        }
        System.out.println("Faktoriyel: "+ faktoriyel);

        int i=0;

        while (i < 10 ) {
            System.out.println("i = " +i);
            i++;

        }





    }
}