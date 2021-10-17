public class MetotlardaOverloading {

    public static void skorhesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var");
    }

    public static void skorhesapla(int puan){
        System.out.println("Adsız oyuncunun " + puan + " puanı var");

    }


    public static void main(String[] args) {
        skorhesapla(70);
        skorhesapla("Alper",70);
        skorhesapla(70);


    }
}
