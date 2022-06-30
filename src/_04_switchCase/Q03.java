package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Yılın hangi ayını ogrenmek istiyorsunuz ? :");
        int ay=scan.nextInt();

        switch (ay){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Girdiginiz ay 31 gundur.");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Girdiginiz ay 30 gundur.");
                break;
            case 2 :
                System.out.print("Lutfen bulundugunuz yılı girin : ");
                int yıl =scan.nextInt();

                if (yıl%4==0){
                    System.out.println("Girdiginiz ay 29 gundur.");
                }else System.out.println("Girdiginiz ay 28 gundur.");
                break;

            default:
                System.out.println("Yıl 12 aydır, dogru duzgun gir...");
        }
    }
}

