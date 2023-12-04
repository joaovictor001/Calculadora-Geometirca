package Planas;

public class Triangulo {
    public double lado;

    Triangulo(double lado){
        this.lado = lado;

    }

    public double calArea (){
        return this.lado * Math.sqrt(0.75);

    }
    public  double calPerimetro(){
        return this.lado * 3;
    }
}
