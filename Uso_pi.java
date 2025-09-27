import java.util.Scanner;
public class Uso_pi
{
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		System.out.println("opção 1_calcular o perímetro do círculo.\n ");
		System.out.println("opção 2_calcular a área do círculo. \n");
		System.out.println("opção 3_calcular o volume da esfera. \n");
		System.out.println("Digite uma opção de calculo: 1 , 2 , 3 :");
		int opcao = leia.nextInt();
	    System.out.println("Digite o valor do raio :");
	    double raio = leia.nextDouble();
	    
	    switch (opcao) { 
	        case 1: 
	        double peri = 2* Math.PI*raio;
	        System.out.printf("perimetro = %.2f \n" , peri);
	        break;
	        case 2: 
	        double area = Math.PI * Math.pow(raio,2);
	        System.out.printf("Área = %.2f \n" , area);
	        break;
	        case 3: 
	        double volume = 4.0/3.0 * Math.PI * Math.pow(raio,3);
	        System.out.printf("volume = %.2f \n", volume);
	        break;
	    default:
	        System.out.println("Errou!!!");
	    }
	leia.close();    
	    
	    
	    
	}
}
