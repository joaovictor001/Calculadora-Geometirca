package Planas;

public class Hexagonal {

    public double lado;

    Hexagonal(double lado){
        this.lado = lado;


    }
    public double calArea(){
        return  6 * this.lado * Math.sqrt(0.75);
    }
    public  double calPerimetro(){
        return this.lado * 6;
    }
}
