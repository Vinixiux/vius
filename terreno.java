import java.util.Scanner;
public class terreno {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area, preco; 
				
		System.out.println("Digite o valor da largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite o valor do comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor por m2 do terreno: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		
		System.out.printf("A área do terreno é de = %.2f\n", area);
		
		preco = area * valor;
		
		System.out.println();
		
		System.out.printf("O valor do terreno é de R$ = %.2f\n", preco);			
			
		sc.close();

	}

}
