package Planas;

public class Retangulo {

    public double base, altura;

    public Retangulo(double base, double altura){
        this.altura = altura;
        this.base = base;

    }


    public double calArea(){
        return this.base * this.altura;
    }

    public double calPerimetro(){
        return (2 *this.base) + (2 * this.altura);
    }
}
