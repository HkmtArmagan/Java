package advencedJavaProject;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise c
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan2.nextDouble();


        if (yas < 18) {
            System.out.println("yasınızdan dolayı kan bagısı yapamazsınız");
        } else if ( kilo< 50) {
            System.out.println("kilonuzdan dolayı kan bagısı yapamazsınız");
        } else {
            System.out.println("kan bagısı yapabilirsiniz");
        }


    }

}
