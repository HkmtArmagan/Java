package _14_Encapsulation.Q01;

public class Araba_Calısma {

    private String model;
    private String renk;
    private int motor;
    private int yıl;

    public Araba_Calısma() {
    }

    public Araba_Calısma(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        // this.yıl = yıl;
        setMotor(motor);
        setYıl(yıl);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000) {
            System.out.println("Boyle motor olmaz ");
        } else
            this.motor = motor;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        if (yıl < 0) {
           this.yıl = (-1)*yıl;
            System.out.println("eksi girdin biz düzelttik");
        } else
            this.yıl = yıl;
    }

    @Override
    public String toString() {
        return "Araba_Calısma{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }
}
