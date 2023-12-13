import Planas.Circulo;
import Planas.Quadrado;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //cria objeto
        //nome Class nome objeto = new Circulo(valor)
        //system.out.println(circulo.metodo());
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, Qual é o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Quer utilizar a Calculadora Geometrica: (S/N)");
        int escolha = scan.nextInt();



            System.out.println("Bem vindo " + nome);
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            while (true) {
                System.out.println("Selecione o que você deseja calcular");
                System.out.println("!!!Digite 1 para calcular Figuras Planas!!!");
                System.out.println("!!!Digite 2 para calcular Figuras Espaciais!!!");

                int Escolha_figuras = scan.nextInt();
                switch (Escolha_figuras) {
                    case 1 -> {
                        System.out.println("OK, " + nome);
                        System.out.println("Agora escolha qual Figura Plana você quer calcular:\n1-Quadrado\n2-Retângulo\n3-Triangulo\n4-Círculo\n5-Hexagono");
                        int Escolhas_Planas = scan.nextInt();
                        switch (Escolhas_Planas) {
                            case 1 -> {
                                while (true) {
                                    double valor_lado;
                                    try {
                                        System.out.println("Imforme o tamanho do lado do Quadrado");
                                        valor_lado = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("DIGITE UM NUMERO VALIDO");
                                        break;
                                    }
                                    if (valor_lado < 0) {
                                        break;
                                    }
                                    System.out.println(nome + "  Qual calculo quer fazer?\n1_calcular Área\n2-Calcular perimetro\n3-Calcular Ambos");
                                    int Calculo_quadrado = scan.nextInt();

                                    switch (Calculo_quadrado) {
                                        case 1 -> {
                                            Quadrado quadrado = new Quadrado(valor_lado);
                                            System.out.println("Area: " + quadrado.calculararea());
                                        }
                                        case 2 -> {
                                            Quadrado quadrado = new Quadrado(valor_lado);
                                            System.out.println("Perimetro:" + quadrado.calPerimetro());

                                        }
                                        case 3 -> {
                                            Quadrado quadrado = new Quadrado(valor_lado);

                                            System.out.println("Area" + quadrado.calculararea());
                                            System.out.println("Perimetro:" + quadrado.calPerimetro());


                                        }
                                        case 4 -> {
                                            return;
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                while (true) {
                                    double valor;
                                    try {
                                        System.out.println("Imforme o tamanho do lado do Quadrado");
                                        valor = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("DIGITE UM NUMERO VALIDO");
                                        return;
                                    }
                                    if (valor < 0) {
                                        break;
                                    }

                                }

                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("OK, " + nome);
                        System.out.println("Agora escolha qual Figura Plana você quer calcular:\n1-Cubo \n2-Paralelepipedo\n3-Cilindro\n4-Cone\n5-Pirâmide \n6-Esfera");
                        int Escolhas_Especiais = scan.nextInt();


                    }

                }


        }
    }
}