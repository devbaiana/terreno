
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		{
			System.out.printf("Olá! Adicione aqui a largura do seu terreno: ");
			Scanner sc = new Scanner(System.in);
			double largura = sc.nextDouble();
			System.out.printf("Agora adicione o comprimento do seu terreno: ");
			double comprimento = sc.nextDouble();
			System.out.printf("Agora adcione o valor por metro quadrado: ");
			double metroQuadrado = sc.nextDouble();
			
			double area = largura * comprimento;
			double preco = area * metroQuadrado;
			
			System.out.println("Sua área é igual a: " + area);
			System.out.println("O preço é: " + preco);
			
			sc.close();
			
		}

	}

}
