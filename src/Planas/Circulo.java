package Planas;

public class Circulo {
        public double  raio;
        final double PI = Math.PI;

         public Circulo(double raio){
            this.raio = raio;


        }

        public double calculararea(){
            return PI *this.raio;
        }

        public double calPerimetro(){
             return 2 * PI * raio;
        }
    }


