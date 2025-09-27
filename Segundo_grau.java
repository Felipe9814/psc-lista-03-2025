import java.util.Scanner;

public class Segundo_grau {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = leia.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = leia.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = leia.nextDouble();
        
        double delta = (b*b)-(4*a*c);
       
        
        if (a == 0 && b == 0 && c != 0){
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if (a == 0 && b != 0 ){
            System.out.println("Essa é uma equação de primeiro grau");
        double primeiro_grau = -c / b;
            System.out.println("Raiz = " + primeiro_grau);}
        else {
        if  (delta == 0){ 
            System.out.println("Raízes reais iguais.");
        double iguais = -b / (2 * a);
            System.out.println("x1=x2="+ iguais);}
        else if (delta < 0) {
            System.out.println ("Esta equação não possui raízes reais");}
        else if (delta > 0){
            System.out.println("Esta equação possui duas raízes reais diferentes. ");
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        System.out.printf("x1 = %.2f \n", x1);
        
        System.out.printf("x2= %.2f \n", x2); }   
        }
        leia.close();
        
         }  
            
                }
        