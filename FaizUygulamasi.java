import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz. Faiz Oranı %6 ");

        int ana_para, vade;
        System.out.print("Yatırmak İstediğiniz Tutar: ");
        ana_para=scanner.nextInt();

        System.out.print("Vade Seçiniz: ");
        vade=scanner.nextInt();

        double toplam_para = ana_para;
        double faizOrani = 0.06;

        for (int i=1; i<= vade; i++) {

            toplam_para = (toplam_para * faizOrani) + toplam_para;
            System.out.println(i + ". yılın sonunda toplam paranız: " + (int)toplam_para);
        }

    }
}