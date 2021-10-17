import java.util.Scanner;

public class LoginUygulamasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int giris_hakki= 3;

        String sys_kullanici_adi = "Alper";
        String sys_parola = "1923";

        System.out.println("********************************");
        System.out.println("Başaran Akademi Öğrenci Girişi");
        System.out.println("********************************");

        while(true) {

            System.out.print("Kullanıcı Adı: ");
            String kullanici = scanner.nextLine();

            System.out.print("Parola: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){

                System.out.println("Hoşgeldiniz, " + kullanici);
                break;

            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){

                System.out.println("Parolanız Yanlış");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }

            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){

                System.out.println("Kullanıcı Adınız Yanlış");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            else {
                System.out.println("Kullanıcı Adınızı ve Parolanızı Yanlış Girdiniz");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }

            if(giris_hakki == 0) {

                System.out.println("Giriş hakkınız bitti. İyi Günler");
                break;
            }

        }


    }
}
