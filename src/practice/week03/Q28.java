package practice.week03;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Musteri Kartiniz Var mi?");
        char musteriKarti = scan.next().charAt(0);
        System.out.println("Kac adet urun aldiniz");
        int urunAdedi = scan.nextInt();
        System.out.println("urunun liste fiatini giriniz");
        int urunFiati = scan.nextInt();
        int toplamHarcanan = urunFiati * urunAdedi;
        int indirimOrani = 0;

        if ((musteriKarti == 'e' || musteriKarti == 'E') && urunAdedi >= 10) {
            indirimOrani = 25;
        } else if ((musteriKarti == 'e' || musteriKarti == 'E') && urunAdedi < 10) {
            indirimOrani = 20;
        } else if ((musteriKarti == 'h' || musteriKarti == 'H') && urunAdedi >= 10) {
            indirimOrani = 15;
        } else if ((musteriKarti == 'h' || musteriKarti == 'H') && urunAdedi < 10) {
            indirimOrani = 10;
        }

        int indirimMiktari = (toplamHarcanan * indirimOrani) / 100;
        int toplamIndirimliFiyat = toplamHarcanan - indirimMiktari;
        System.out.println("Indirimli odeyeceginiz tutar=" + toplamIndirimliFiyat);
    }
}
