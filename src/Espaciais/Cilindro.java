package Espaciais;

public class Cilindro {
    public double  raio, altura;
    public final double PI = Math.PI;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    public double calculateVolumeCilindro(){
        return this.PI * this.altura * Math.pow(this.raio,2);
    }

    public double calculateAreaSuperficial(){
        return this.PI * this.raio * Math.sqrt(Math.pow(this.raio,2)+ Math.pow(this.altura , 2));
    }
}
