import java.util.Scanner;

public class Metotlar {


    //public: Erişim Belirleyici (public-private-protected)
    //static: Ekstra Özellik
    //void: Dönüş Tipi (void - return)

    public static void selamlama() {

        System.out.println("Merhaba");

    }

    public static void faktoriyel() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz");
        int sayi = scanner.nextInt();

        int faktoriyel =1;

        while (sayi > 0) {

            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel: " +faktoriyel);

    }





    public static void main(String[] args) {

        selamlama();
        faktoriyel();


    }
}
