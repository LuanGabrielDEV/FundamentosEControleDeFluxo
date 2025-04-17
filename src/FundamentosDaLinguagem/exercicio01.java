package FundamentosDaLinguagem;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
    }

    //01 - Imprimir Nome e Idade
    private static void imprimirNomeIdade() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;


        System.out.println("Olá " + nome + ", você tem " + idade + " anos");
        sc.close();

    }

    //02 - Cálculo de Área do Quadrado
    private static void calcularAreaQuadrado() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o tamanho do lado? ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("Área do quadrado: " + area);
        sc.close();


    }
    //03 - Calcular Área do Retângulo
    private static void calcularAreaRetangulo() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o tamanho da base? ");
        double base = sc.nextDouble();
        System.out.println("Digite o tamanho da altura? ");
        double altura = sc.nextDouble();
        double area = base * altura;

        System.out.println("Área do retangulo: " + area);
        sc.close();

    }
    //04 - Diferença de Idades
    private static void calcularDiferencaadeIdades() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome = sc.nextLine();
        System.out.println("Sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o segundo nome: ");
        String nome2 = sc.nextLine();
        System.out.println("Sua idade: ");
        int idade2 = sc.nextInt();
        int difIdade = idade2 - idade;

        if (idade2 > idade) {
            System.out.println("A diferença de idades de " +nome+ "e " + nome2 + " é igual a: " + difIdade);

        }else
            System.out.println("A segunda idade tem que ser maior que a primeira!");
        sc.close();

    }

}
