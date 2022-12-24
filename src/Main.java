import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        while (true) {

            System.out.println("""
                    0- Programı Sonlandır
                    1- Toplama İşlemi
                    2- Çıkarma İşlemi
                    3- Çarpma İşlemi
                    4- Bölme işlemi
                    5- Üslü Sayı Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dikdörtgen Alan ve Çevre Hesabı\n""");

            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextByte();

            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    sum();
                    break;

                case 2:
                    minus();
                    break;

                case 3:
                    times();
                    break;

                case 4:
                    divided();
                    break;

                case 5:
                    pow();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                default:
                    System.out.println("Lütfen geçerli bir işlem numarası seçiniz!!!");
            }

        }

        System.out.println("Hesap makinesi kapanıyor !!!");
    }

    static void sum() {
        int sayi1, sayi2, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 + sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void minus() {
        int sayi1, sayi2, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 - sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void times() {
        int sayi1, sayi2, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 * sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void divided() {
        int sayi1, sayi2, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        if (sayi2 == 0) {
            System.out.println("Sıfıra bölünemez!!!");
        } else {
            sonuc = sayi1 / sayi2;
            System.out.println("SONUÇ: " + sonuc);
        }
    }

    static void pow() {
        int taban, us, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        taban = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        us = input.nextInt();

        for (int x = 1; x <= us; x++) {
            sonuc *= taban;
        }
        System.out.println("SONUÇ: " + sonuc);
    }

    static void factorial() {
        int sayi, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 1; x <= sayi; x++) {
            sonuc *= x;
        }

        System.out.println("SONUÇ: " + sonuc);
    }

    static void mod() {
        int sayi, mod, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        mod = input.nextInt();

        sonuc = sayi % mod;
        System.out.println("SONUÇ: " + sonuc);
    }
}