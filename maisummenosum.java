import java.util.Scanner;

public class maisummenosum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sucessor, antecessor;
		
		System.out.println("Digite um n�mero inteiro para informarmos o seu antecessor e sucessor: ");
		int numero = sc.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O n�mero digitado foi o: " + numero);
		System.out.println("O seu antecessor �: " + antecessor);
		System.out.println("O seu sucessor �: " + sucessor);
		
		sc.close();

	}

}
