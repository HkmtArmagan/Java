package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str = scan.next();

        if (str.contains("  ")) {
            System.out.println("Bosluk iceriyor");
        } else System.out.println("Bosluk icermiyor");
    }
}

