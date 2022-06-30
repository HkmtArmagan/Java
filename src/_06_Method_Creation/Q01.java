package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz : ");
        String kelime = scan.next();

        ilkIkısız(kelime);

        System.out.println(ilkIkısız(kelime));

    }

    private static String ilkIkısız(String kelime) {
        String kalanHarfler = "";
        if (kelime.startsWith("gh")) {
            kalanHarfler = kelime;
        } else if (kelime.startsWith("g")) {
            kalanHarfler = kelime.charAt(0) + kelime.substring(2);
        } else if (kelime.startsWith("p")) {
            kalanHarfler = kelime.substring(1);
        } else {
            kalanHarfler = kelime.substring(2);

        }
        return kalanHarfler;
    }
}






