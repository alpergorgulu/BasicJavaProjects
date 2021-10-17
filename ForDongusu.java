public class ForDongusu {
    public static void main(String[] args) {

        //int i;

        for (int i=1; i<=5; i++) {

            System.out.println("i = "+i);
        }

        System.out.println("***********************************");

        for (int i=5; i>=0; i--) {

            System.out.println("i = "+i);
        }
        System.out.println("***********************************");

        int j=0;
        for (; j<5; j++) {

            System.out.println("Java Öğreniyorum");
        }
        System.out.println("***********************************");

        int a=0;
        int k=10;
        for (; a<10 && k>0; a++,k--) {

            System.out.println("a: " +a);
            System.out.println("k: " +k);
        }








    }
}