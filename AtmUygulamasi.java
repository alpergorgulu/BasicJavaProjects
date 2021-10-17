import java.util.Scanner;

public class AtmUygulamasi {
    public static void main(String[] args) {

        /*
        * İşlemler
        * 1. İşlem: Bakiye Öğrenme
        * 2. İşlem: Para çekme
        * 3. İşlem: Para Yatırma
        * Çıkış: q
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int bakiye=1000;

        String islemler = "1. İşlem: Bakiye Öğrenme \n"
                          +"2. İşlem: Para Çekme \n"
                          +"3. İşlem: Para Yatırma \n"
                          +"Çıkış için q tuşuna basınız";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");

        while(true) {

            System.out.print("Lütfen İşlemi Seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Programdan Çıkılıyor");
                break;
            }
            else if (islem.equals("1")){

                System.out.println("Bakiyeniz: "+bakiye + "TL");

            }

            else if (islem.equals("2")){

                System.out.println("Çekmek İstediğiniz Tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar <0 ) {

                    System.out.println("Yeterli Bakiye Yok. Bakiyeniz: " + bakiye + "TL'dir");
                }

                else {
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye + "TL'dir");

                }

                }
            else if (islem.equals("3")){

                System.out.print("Yatırmak İstediğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;

                System.out.println("Yeni Bakiyeniz: " + bakiye + "TL'dir");
            }
                else {

                System.out.println("Geçersiz bir İşlem Seçtiniz");
            }


            }

        }




    }


