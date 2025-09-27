import java.util.Scanner;

public class Maquina{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


		double din1 = 1.00;
		double din2 = 2.00;
		double din3 = 5.00;
		double din4 = 10.00;
		double din5 = 20.00;
		double din6 = 50.00;


		double sonho_de_valsa = 1.0;
		double coca_cola = 4.50;
		double doritos = 3.50;
		double trident = 3.0;

		System.out.println("1 - Sonho de Valsa - R$ 1,00");
		System.out.println("2 - Coca Cola      - R$ 4,50");
		System.out.println("3 - Doritos        - R$ 3,50");
		System.out.println("4 - Trident        - R$ 3,00");

		double saldo = 0;


		while (true) {
			System.out.println("Coloque o dinheiro \n (notas aceitas: 1, 2, 5, 10, 20, 50): ");
			double dinheiro = ler.nextDouble();

			if (dinheiro == din1 || dinheiro == din2 || dinheiro == din3 ||
			        dinheiro == din4 || dinheiro == din5 || dinheiro == din6) {
				saldo += dinheiro;
				System.out.printf("Saldo atual: R$ %.2f%n", saldo);
				break;
			} else {
				System.out.println("Nota invalida! Tente novamente.");
			}
		}

		int cod_d = -1;

		while (cod_d != 0 && saldo > 0) {
			System.out.println("Digite o codigo do produto ou 0 para sair : ");
			cod_d = ler.nextInt();

			switch (cod_d) {
			case 1 -> {
					if (saldo >= sonho_de_valsa) {
						System.out.println("Produto liberado: Sonho de Valsa");
						saldo -= sonho_de_valsa;
					} else {
						System.out.println("Saldo insuficiente!");
					}
				}
			case 2 -> {
					if (saldo >= coca_cola) {
						System.out.println("Produto liberado: Coca Cola");
						saldo -= coca_cola;
					} else {
						System.out.println("Saldo insuficiente!");
					}
				}
			case 3 -> {
					if (saldo >= doritos) {
						System.out.println("Produto liberado: Doritos");
						saldo -= doritos;
					} else {
						System.out.println("Saldo insuficiente!");
					}
				}
			case 4 -> {
					if (saldo >= trident) {
						System.out.println("Produto liberado: Trident");
						saldo -= trident;
					} else {
						System.out.println("Saldo insuficiente!");
					}
				}
			case 0 -> System.out.println("Encerrando...");
				default -> System.out.println("Codigo invalido!");
			}

			System.out.printf("Saldo restante: R$ %.2f%n", saldo);
		}

		System.out.printf("Troco final: R$ %.2f%n", saldo);
		ler.close();
	}
}


