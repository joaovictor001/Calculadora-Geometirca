package Espaciais;

public class Cone {
    public double raio, altura;
    public final double PI = Math.PI;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calculateVolumeCone() {
        return Math.sqrt(0.75) * this.PI * Math.pow(this.raio, 2) * this.altura;
    }

    public double calculateAreaSuperficialCone() {
        return this.PI * this.raio * Math.sqrt(Math.pow(this.raio, 2) + Math.pow(this.altura, 2));
    }
}