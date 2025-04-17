package EstruturaDeControle;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
    }

    //01 - Exibir tabuada
    private static void tabuadas() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para ver a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    //02 - Cálculo de IMC
    private static void calcularImc() {
        Scanner sc = new Scanner(System.in);
        double altura;
        double peso;

        do {
            System.out.println("Digite sua altura (em metros):");
            altura = sc.nextDouble();

            System.out.println("Digite seu peso (em kg):");
            peso = sc.nextDouble();

            if (altura <= 0 || peso <= 0) {
                System.out.println("Altura e peso devem ser maiores que zero.");
            }
        } while (altura <= 0 || peso <= 0);

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso ideal";
        } else if (imc < 30) {
            classificacao = "Levemente acima do peso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II (Severa)";
        } else {
            classificacao = "Obesidade grau III (Mórbida)";
        }

        System.out.printf("Seu IMC: %.2f. %s%n", imc, classificacao);

        sc.close();
    }
    //03 - Mostrar Pares e Impares em ordem decrescente
    private static void mostrarParesOuImpares() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiro = sc.nextInt();

        int segundo;

        do {
            System.out.println("Digite o segundo valor(maior que o primeiro): ");
            segundo = sc.nextInt();
            if (segundo <= primeiro) {
                System.out.println("O segundo valor deve ser maior que o primeiro!");
            }
        } while (segundo <= primeiro);

        sc.nextLine();
        System.out.println("Você quer ver os números pares ou ímpares? (par/impar): ");
        String escolha = sc.nextLine().trim().toLowerCase();

        boolean mostrarPares = escolha.equals("par");
        System.out.println("\nNúmeros " + (mostrarPares ? "pares" : "ímpares") + " no intervalo em ordem decrescente:");

        for (int i = segundo; i >= primeiro; i--) {
            if (mostrarPares && i % 2 == 0) {
                System.out.println(i);
            } else if (!mostrarPares && i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    // 04 - Loop que encerra quando o valor base não faz uma divisão exata do valorN
    private static void divisaoControlada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: (valor base): ");
        int valorBase = sc.nextInt();

        if (valorBase == 0){
            System.out.println("Não é possível dividir por zero. Encerrado.");
            sc.close();
            return;
        }

        int valorN;
        do {
            System.out.println("Digite outro valor: (valor N): ");
            valorN = sc.nextInt();

            if (valorN < valorBase){
                System.out.println("O valor deve ser maior que o valor base. Ignorado...");
                continue;
            }

            if(valorN % valorBase != 0){
                System.out.println("Número não divisível por " + valorBase + ". Encerrado..." );
                break;
            }
            System.out.println("Número válido: " + valorN);

        } while(true);
        sc.close();

        }
    }

