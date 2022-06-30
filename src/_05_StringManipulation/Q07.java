package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("agam bir isim gir : ");
        String str=scan.next();
        char c1=str.charAt(0);
        char c2=str.charAt(1);
        char c3=str.charAt(2);
       String ad= str.length()==3?((c1!=c2 && c2!=c3  &&  c1!=c3)? "girdiginiz isim unique":
                "girdiginiz isim unique degil"):"girdiginiz karakter 3 harfli degil ";

        System.out.println(ad);
    }
}