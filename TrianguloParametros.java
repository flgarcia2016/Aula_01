
import java.util.Scanner;

class TrianguloParametros {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

        // Declaracao de variavel		
		int base ;
		int altura;

        System.out.println("Digite a base do triangulo ");
        base = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite a altura do triangulo ");
        altura = Integer.parseInt(entrada.nextLine());


        int area = (base * altura / 2);
		 

        System.out.println(area);
	}
}