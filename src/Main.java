import Planas.Circulo;
import Planas.Quadrado;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //cria objeto
        //nome Class nome objeto = new Circulo(valor)
        //system.out.println(circulo.metodo());
        Scanner scan  = new Scanner(System.in);

        System.out.println("Olá, Qual é o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Bem vindo "+ nome);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("Selecione o que você deseja calcular");
        System.out.println("!!!Digite 1 para calcular Figuras Planas!!!");
        System.out.println("!!!Digite 2 para calcular Figuras Espaciais!!!");
        int Escolha_figuras = scan.nextInt();
        switch (Escolha_figuras){
            case 1 -> {
                System.out.println("OK, "+nome);
                System.out.println("Agora escolha qual Figura Plana você quer calcular:\n1-Quadrado\n2-Retângulo\n3-Triangulo\n4-Círculo\n5-Hexagono");
                int Escolhas_Planas = scan.nextInt();
                switch (Escolhas_Planas){
                    case 1 ->{
                        System.out.println("Imforme o tamanho do lado do Quadrado");
                        double valor_lado = scan.nextDouble();
                        System.out.println(nome + "Qual calculo quer fazer?\n1_calcular Área\n2-Calcular perimetro\n3-Calcular Ambos");
                        int Calculo_quadrado = scan.nextInt();
                        switch (Calculo_quadrado){
                            case 1 ->{
                                Quadrado quadrado = new Quadrado(valor_lado);
                                System.out.println(quadrado.calculararea());
                            }
                            case 2 ->{
                                Quadrado quadrado = new Quadrado(valor_lado);
                                System.out.println(quadrado.calPerimetro());

                            }
                            case 3 ->{
                                Quadrado quadrado = new Quadrado(valor_lado);
                                
                                System.out.println(quadrado.calculararea());
                                System.out.println(quadrado.calPerimetro());


                            }
                        }

                    }
                }
            }
            case 2 ->{
                System.out.println("OK, "+nome);
                System.out.println("Agora escolha qual Figura Plana você quer calcular:\n1-Cubo \n2-Paralelepipedo\n3-Cilindro\n4-Cone\n5-Pirâmide \n6-Esfera");
                int Escolhas_Especiais = scan.nextInt();


            }

        }


    }
}