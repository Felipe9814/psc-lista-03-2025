import java.util.Scanner;
public class Maior
{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Primero numero: ");
		int num_1 = leia.nextInt();
		System.out.println("Segundo numero: ");
		int num_2 = leia.nextInt();
		System.out.println("Terceiro numero: ");
		int num_3 = leia.nextInt();
		
       
        int maior = num_1 ;
        if (num_2 > maior) maior = num_2;
        if (num_3 > maior) maior = num_3;

        int menor = num_1;
        if (num_2 < menor) menor = num_2;
        if (num_3 < menor) menor = num_3;

        
        double media = (num_1 + num_2 + num_3) / 3.0;
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média aritmética: %.2f%n", media);

        leia.close();
    }
}
        
        
	