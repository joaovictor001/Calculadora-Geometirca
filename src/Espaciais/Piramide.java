package Espaciais;

public class Piramide {

    public double  apotema, arestadabase, altura;

    public Piramide(double altura, double apotema, double arestadabase) {

        this.apotema = apotema;
        this.arestadabase = arestadabase;
        this.altura = altura;
    }

    public double calculateAreaSuperficial(){
        return (2 * this.arestadabase * this.apotema)+ Math.pow(this.arestadabase,2);
    }
    public  double calcualteVolumePiramide(){
        return (this.arestadabase* this.altura );
    }
}
