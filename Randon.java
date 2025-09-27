import java.util.Scanner;
import java.util.Random;

public class Randon {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random sorteio = new Random();

        
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = ler.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = ler.nextInt();

        
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        
               int numeroSorteado = sorteio.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);

      
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }

        ler.close();
    }
}