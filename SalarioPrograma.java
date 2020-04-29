import java.util.Scanner;
import java.text.DecimalFormat;
public class SalarioPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		float qtdsal;
		
		System.out.println("Informe o valor do sal�rio m�nimo atual: ");
		int salminimo = sc.nextInt();
		
		System.out.println("Inform agora o valor do seu sal�rio: ");
		int salpessoa = sc.nextInt();
		
				qtdsal = (float) salpessoa / salminimo; 
		
		System.out.println("Voc� recebe: " + dc.format(qtdsal) + " Sal�rios M�nimos.");
		
		sc.close();
	}

}
