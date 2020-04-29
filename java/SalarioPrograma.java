import java.util.Scanner;
import java.text.DecimalFormat;
public class SalarioPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		float qtdsal;
		
		System.out.println("Informe o valor do salário mínimo atual: ");
		int salminimo = sc.nextInt();
		
		System.out.println("Inform agora o valor do seu salário: ");
		int salpessoa = sc.nextInt();
		
				qtdsal = (float) salpessoa / salminimo; 
		
		System.out.println("Você recebe: " + dc.format(qtdsal) + " Salários Mínimos.");
		
		sc.close();
	}

}
