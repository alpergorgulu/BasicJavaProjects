import java.util.Scanner;

public class FaktroriyelHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Lütfen Bir Sayı Giriniz");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i<=sayi; i++) {
            faktoriyel *=i;
            System.out.println(("Faktoriyel = " +faktoriyel + "i= " +i));

        }
        System.out.println(("Faktoriyel = " + faktoriyel));

    }

}