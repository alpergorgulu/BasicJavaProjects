import java.util.Scanner;

public class GelismisNotHesaplama {

    public static void main(String[] args) {

        // Algoritma
        //1- Kişiden Vize1 Notu İstenecek
        //2- Kişiden Vize2 Notu İstenecek
        //3- Kişiden Final Notu İstenecek
        //4- Bölümden Not Ortalaması İstenecek

        Scanner scanner = new Scanner(System.in); //Input Alma Sınıfı / Objesi Oluşturuldu.

        System.out.print("Vize1 notunu giriniz");
        int vize1 = scanner.nextInt();

        System.out.print("Vize 2 Notunu Girin");
        int vize2 = scanner.nextInt();

        System.out.print("Final Notunu Girin");
        int finalNot = scanner.nextInt();  //Final anahtar kelimesi değişken ismi olarak verilemez.

        System.out.print("Okul Notunu Girin");
        double ortalama = scanner.nextDouble();

        double toplamNot = (vize1 * 0.3) + (vize2 * 0.3) + (finalNot * 0.4);

        if (toplamNot >=90) {
            System.out.println("AA");
        }
        else if (toplamNot >=85) {
            System.out.println("BA");
        }
        else if (toplamNot >=75) {
            System.out.println("CB");
        }
        else if (toplamNot >=60) {
            System.out.println("DD");
        }

            if(ortalama < 2.50) {

                    System.out.println("DD Aldınız ve Not ortalamanız düşük. Dersi Tekrar Almak İster misiniz?");

            }

            else if(toplamNot >=55) {

                System.out.println("FF ile Kaldınız");
            }



    }
}