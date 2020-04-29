import java.util.Scanner;
import java.text.DecimalFormat;

public class valorcomipi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df =  new DecimalFormat("0.00");
		float valorfinal;
		
		System.out.println("Digite a al�quota (porcentagem) do IPI vigente: ");
		float ipi = sc.nextFloat();
		
		System.out.println("Digite agora o valor da primeira pe�a: ");
		float valorum = sc.nextFloat();
		
		System.out.println("Digite agora a quantidade de pe�as: ");
		int qtdum = sc.nextInt();
		
		System.out.println("Digite agora o valor da segunda pe�a: ");
		float valordois = sc.nextFloat();
		
		System.out.println("Digite agora a quantidade de pe�as: ");
		int qtddois = sc.nextInt();
		
		valorfinal = (valorum * qtdum + valordois * qtddois) * (ipi/100 + 1);
			
		
		System.out.println("O valor final a ser pago � de: " + df.format(valorfinal) + " reais.");
		
		sc.close();
	}

}
