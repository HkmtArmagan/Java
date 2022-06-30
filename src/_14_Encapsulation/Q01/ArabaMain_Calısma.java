package _14_Encapsulation.Q01;

public class ArabaMain_Calısma {
    public static void main(String[] args) {
        Araba_Calısma honda = new Araba_Calısma();
        honda.setModel("cıvıc");
        honda.setMotor(1600);
        honda.setRenk("gri");
        honda.setYıl(2015);
        Araba_Calısma toyota = new Araba_Calısma("corolla", "kırmızı", 1600, -2016);
        Araba_Calısma volvo = new Araba_Calısma("s60", "siyah", 200, 2018);

        System.out.println(honda);
        System.out.println(toyota);
        System.out.println("Volvo arac icin -> " + " model : " + volvo.getModel() + " yıl : " + volvo.getYıl());
    }
}
