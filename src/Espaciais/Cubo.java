package Espaciais;

public class Cubo {
    public  double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    public double calculateVolumeCubo(){
        return  this.lado * this.lado * this.lado;
    }

    public double calculateAsuperficial(){
        return Math.pow(this.lado,2)* 6 ;
    }



}
