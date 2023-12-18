import Espaciais.*;
import Planas.*;


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
                                        System.out.println("Imforme o tamanho do lado do Quadrado:\n");
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

                                            System.out.println("Area: " + quadrado.calculararea());
                                            System.out.println("Perimetro: " + quadrado.calPerimetro());


                                        }
                                        case 4 -> {
                                            return;
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                while (true) {
                                    double valorb,valoraltura ;
                                    try {
                                        System.out.println("Imforme o tamanho da base do Retangulo");
                                        valorb = scan.nextDouble();
                                        System.out.println("Imforme o tamanho da altura do Retangulo");
                                        valoraltura = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("DIGITE UM NUMERO VALIDO");
                                        return;
                                    }
                                    if (valorb <= 0  || valoraltura <= 0) {
                                        System.out.println("Não aceitamos numeros menor que 0 ");
                                        continue;
                                    }
                                    System.out.println("o que vc deseja calcular: 1- Área 2- Perimetro");
                                    int escolha_conta = scan.nextInt();
                                    switch (escolha_conta){
                                        case 1 ->{
                                            Retangulo retangulo = new Retangulo(valorb, valoraltura);
                                            System.out.println("Area "+retangulo.calArea());
                                            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                                        }
                                        case 2->{
                                            Retangulo retangulo = new Retangulo(valorb, valoraltura);
                                            System.out.println("Perimetro "+ retangulo.calPerimetro());
                                            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

                                        }
                                        case 3 ->{
                                            Retangulo retangulo = new Retangulo(valorb, valoraltura);
                                            System.out.println("Area "+retangulo.calArea());
                                            System.out.println("Perimetro "+ retangulo.calPerimetro());
                                            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

                                        }

                                    }

                                }

                            }
                            case 3->{
                                while (true) {
                                    double valor_lado;
                                    try {
                                        System.out.println("Imforme o tamanho do lado do Triângulo");
                                        valor_lado = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("!!!DIGITE UM NUMERO VALIDO!!!");
                                        break;
                                    }
                                    if (valor_lado < 0) {
                                        break;
                                    }
                                    System.out.println(nome + "  Qual calculo quer fazer?\n1_calcular Área\n2-Calcular perimetro\n3-Calcular Ambos");
                                    int Calculo_escolhido = scan.nextInt();
                                    switch (Calculo_escolhido){
                                        case 1->{

                                            Triangulo triangulo = new Triangulo(valor_lado);
                                            System.out.println("Área: "+ triangulo.calArea());
                                        }
                                        case 2->{
                                            Triangulo triangulo = new Triangulo(valor_lado);
                                            System.out.println("Área: "+ triangulo.calPerimetro());
                                        }
                                        case 3->{
                                            Triangulo triangulo = new Triangulo(valor_lado);
                                            System.out.println("Área: "+ triangulo.calArea());
                                            System.out.println("Área: "+ triangulo.calPerimetro());
                                        }
                                    }
                                }

                            }
                            case 4 ->{
                                while (true) {
                                    double valor_raio;
                                    try {
                                        System.out.println("Imforme o tamanho do Raio");
                                        valor_raio = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("!!!DIGITE UM NUMERO VALIDO!!!");
                                        break;
                                    }
                                    if (valor_raio < 0) {
                                        break;
                                    }
                                    System.out.println(nome + "  Qual calculo quer fazer?\n1_calcular Área\n2-Calcular perimetro\n3-Calcular Ambos");
                                    int Calculo_escolhido = scan.nextInt();
                                    switch (Calculo_escolhido){
                                        case 1->{
                                            Circulo circulo = new Circulo(valor_raio);
                                            System.out.println("Área: " + circulo.calculararea());
                                        }
                                        case 2->{
                                            Circulo circulo = new Circulo(valor_raio);
                                            System.out.println("Perimetro: " + circulo.calPerimetro());
                                        }
                                        case 3->{
                                            Circulo circulo = new Circulo(valor_raio);
                                            System.out.println("Área: " + circulo.calculararea());
                                            System.out.println("Perimetro: " + circulo.calPerimetro());
                                        }
                                    }
                                }
                            }
                            case 5->{
                                while (true) {
                                    double valor_lado;
                                    try {
                                        System.out.println("Imforme o tamanho do lado: ");
                                        valor_lado = scan.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.out.println("!!!DIGITE UM NUMERO VALIDO!!!");
                                        break;
                                    }
                                    if (valor_lado < 0) {
                                        break;
                                    }
                                    System.out.println(nome + "  Qual calculo quer fazer?\n1_calcular Área\n2-Calcular perimetro\n3-Calcular Ambos");
                                    int Calculo_escolhido = scan.nextInt();
                                    switch (Calculo_escolhido){
                                        case 1->{
                                            Hexagonal hexagonal = new Hexagonal(valor_lado);
                                            System.out.println("Área: " + hexagonal.calArea());
                                        }
                                        case 2->{
                                            Hexagonal hexagonal = new Hexagonal(valor_lado);
                                            System.out.println("Perimetro: " + hexagonal.calPerimetro());
                                        }
                                        case 3->{
                                            Hexagonal hexagonal = new Hexagonal(valor_lado);
                                            System.out.println("Área: " + hexagonal.calArea());
                                            System.out.println("Perimetro: " + hexagonal.calPerimetro());
                                        }
                                    }
                                }

                            }

                        }
                    }
                    case 2 -> {
                        System.out.println("OK, " + nome);
                        System.out.println("Agora escolha qual Figura Plana você quer calcular:\n1-Cubo \n2-Paralelepipedo\n3-Cilindro\n4-Cone\n5-Pirâmide \n6-Esfera");
                        int Escolhas_Especiais = scan.nextInt();
                        switch (Escolhas_Especiais){
                            case 1->{
                                double lado;
                                while (true){
                                    System.out.println("Imforme o valor do lado: ");
                                    lado = scan.nextDouble();
                                    System.out.println("Qual calculo voce deseja fazer? 1-Volume 2- Área \n");
                                    int escolha_caçculo = scan.nextInt();
                                    switch (escolha_caçculo){
                                        case 1->{
                                            Cubo cubo = new Cubo(lado);
                                            System.out.println("Volume: "+ cubo.calculateVolumeCubo());
                                        }
                                        case 2->{
                                            Cubo cubo  = new Cubo(lado);
                                            System.out.println("Área: " + cubo.calculateAsuperficial());

                                        }
                                        case 3 ->{
                                            Cubo cubo = new Cubo(lado);
                                            System.out.println("Volume: "+ cubo.calculateVolumeCubo());
                                            System.out.println("Área: " + cubo.calculateAsuperficial());
                                        }
                                    }
                                }
                            }
                            case 2->{
                                double comprimento,altura, largura;
                                while (true){
                                    System.out.println("Imforma o valor do comprimento:\n");
                                    comprimento = scan.nextDouble();
                                    System.out.println("Imforma o valor da altura:\n");
                                    altura = scan.nextDouble();
                                    System.out.println("Imforma o valor da largura:\n");
                                    largura = scan.nextDouble();
                                    Paralelepipedo paralelepipedo = new Paralelepipedo(altura,largura,comprimento);
                                    System.out.println("Volume: " + paralelepipedo.calculateVolume());

                                }
                            }
                            case 3->{
                                double raio, altura;
                                while (true){
                                    System.out.println("Imforma o valor do comprimento:\n");
                                    raio = scan.nextDouble();
                                    System.out.println("Imforma o valor da altura:\n");
                                    altura = scan.nextDouble();
                                    System.out.println("Qual calculo voce deseja fazer? 1-Volume 2- Área 3-Ambos \n");
                                    int escolha_calculo = scan.nextInt();
                                    switch (escolha_calculo){
                                        case 1->{
                                            Cilindro cilindro = new Cilindro(raio,altura);
                                            System.out.println("Volume: "+ cilindro.calculateVolumeCilindro());
                                        }
                                        case 2->{
                                            Cilindro cilindro = new Cilindro(raio,altura);
                                            System.out.println("Área: "+cilindro.calculateAreaSuperficial());
                                        }
                                        case 3 ->{
                                            Cilindro cilindro = new Cilindro(raio,altura);
                                            System.out.println("Volume: "+ cilindro.calculateVolumeCilindro());
                                            System.out.println("Área : "+cilindro.calculateAreaSuperficial());
                                        }
                                }
                            }
                        }
                        case 4 ->{
                            double raio, altura;
                            while (true){
                                System.out.println("Imforma o valor do raio:\n");
                                raio = scan.nextDouble();
                                System.out.println("Imforma o valor da altura:\n");
                                altura = scan.nextDouble();
                                System.out.println("Qual calculo voce deseja fazer? 1-Volume 2- Área 3-Ambos \n");
                                int escolha_calculo = scan.nextInt();
                                switch (escolha_calculo){
                                    case 1->{
                                        Cone cone = new Cone(raio,altura);
                                        System.out.println("Volume: "+ cone.calculateVolumeCone());
                                    }
                                    case 2->{
                                        Cone cone = new Cone(raio,altura);
                                        System.out.println("Área: "+ cone.calculateAreaSuperficialCone());
                                    }
                                    case 3 ->{
                                        Cone cone = new Cone(raio,altura);
                                        System.out.println("Volume: "+ cone.calculateVolumeCone());
                                        System.out.println("Área: "+ cone.calculateAreaSuperficialCone());
                                    }
                                }
                            }

                        }
                        case 5->{
                            double apotema, arestadabase, altura;
                            while (true){
                                System.out.println("Imforma o valor do raio:\n");
                                apotema = scan.nextDouble();
                                System.out.println("Imforma o valor do arestadabase:\n");
                                arestadabase = scan.nextDouble();
                                System.out.println("Imforma o valor da altura:\n");
                                altura = scan.nextDouble();


                                System.out.println("Qual calculo voce deseja fazer? 1-Volume 2- Área 3-Ambos \n");
                                int escolha_calculo = scan.nextInt();

                                switch (escolha_calculo){
                                    case 1->{
                                        Piramide piramide = new Piramide(apotema,arestadabase,altura);
                                        System.out.println("Volume: "+ piramide.calcualteVolumePiramide());
                                    }
                                    case 2->{
                                        Piramide piramide = new Piramide(apotema,arestadabase,altura);
                                        System.out.println("Volume: "+ piramide.calculateAreaSuperficial());
                                    }
                                    case 3 ->{
                                        Piramide piramide = new Piramide(apotema,arestadabase,altura);
                                        System.out.println("Volume: "+ piramide.calcualteVolumePiramide());
                                        System.out.println("Área: " + piramide.calculateAreaSuperficial());
                                    }
                                }
                            }

                        }
                        case 6->{
                            double raio;
                            while (true){
                                System.out.println("Imforma o valor do raio:\n");
                                raio = scan.nextDouble();

                                System.out.println("Qual calculo voce deseja fazer? 1-Volume 2- Área 3-Ambos \n");
                                int escolha_calculo = scan.nextInt();

                                switch (escolha_calculo){
                                    case 1->{
                                        Esfera
                                        System.out.println("Volume: "+ piramide.calcualteVolumePiramide());
                                    }
                                    case 2->{
                                        Piramide piramide = new Piramide(apotema,arestadabase,altura);
                                        System.out.println("Volume: "+ piramide.calculateAreaSuperficial());
                                    }
                                    case 3 ->{
                                        Piramide piramide = new Piramide(apotema,arestadabase,altura);
                                        System.out.println("Volume: "+ piramide.calcualteVolumePiramide());
                                        System.out.println("Área: " + piramide.calculateAreaSuperficial());
                                    }
                                }
                            }

                        }

                        }


                    }

                }


        }
    }
}