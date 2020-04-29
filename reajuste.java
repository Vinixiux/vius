import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float saldo, novosaldo;
		
		System.out.println("Por favor, informe o seu saldo: ");		
		saldo = sc.nextFloat();
		novosaldo = saldo + ((saldo * 1)/100);
		System.out.println("O seu saldo com o reajuste de 1% é de: " + novosaldo  + " reais.");
		sc.close();

	}

}
