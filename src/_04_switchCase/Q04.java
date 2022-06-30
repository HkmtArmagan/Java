package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.print("Pazartesi : 1\n Salı : 2\n Çarşamba : 3\n" +
                "Perşembe : 4\n Cuma : 5\n Cumartesi : 6\n Pazar : 7\n Haftanın kacıncı gununde oldugunuzu giriniz :");
        int kacıncıGun = scan.nextInt();
        if (kacıncıGun < 1 || kacıncıGun >= 8) {
            System.out.println("hatali giris");
        int kacGunSonrasi = scan.nextInt();
        int bulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

            switch (bulunanGun) {

                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam hafta 7 gun :-( ");
            }
        }else System.out.println("Hatalı gun girdiniz");
    }

    }


