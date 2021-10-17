import java.util.Scanner;

public class BreakCont {

    public static void main(String[] args) {

       /* Scanner scanner =new Scanner(System.in);

        while(true) {

            System.out.println("Bir sayı giriniz");
            int islem = scanner.nextInt();

            if (islem == -1) {
                System.out.println("Döngüden Çıkılıyor");
                break;

            }
            System.out.println("İşlem: "+ islem);

        }  */

        int i = 0;
        while (i < 10 ) {

            if (i==3 || i==5) {
               i++;
               continue;

            }
            System.out.println("i= " +i);
            i++;

        }
    }
}
