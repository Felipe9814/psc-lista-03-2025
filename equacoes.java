import java.util.Scanner;

public class equacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero : ");
        double n1 = ler.nextDouble();

        System.out.println("Digite o segundo numero : ");
        double n2 = ler.nextDouble();

        System.out.println("Op. que deseja executar");
        System.out.println("+ _ soma ");
        System.out.println("- _ subtração");
        System.out.println("* _ multiplicação");  
        System.out.println("/ _ divisão");
        System.out.println("^ _ potência ");

        String op = ler.next();

        switch (op) {
            case "+":
                System.out.println("Resultado da soma: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Resultado da subtração: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Resultado da multiplicação: " + (n1 * n2));
                break;
            case "/":
                if (n2 != 0)
                    System.out.println("Resultado da divisão: " + (n1 / n2));
                else
                    System.out.println("Erro: divisão por zero!");
                break;
            case "^":
                System.out.println("Resultado da potência: " + Math.pow(n1, n2));
                break;
            default:
                System.out.println("Erro: operação inválida!");
        }

        ler.close();
    }
}