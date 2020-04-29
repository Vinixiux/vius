import java.util.Scanner;

public class idadedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ano, mes, dia, diaidade;
		
		System.out.println("Programa conversor de idade em anos, meses e dias em dias");
		System.out.println();
		System.out.println("Digite a parte da idade em ANOS: ");
		ano = sc.nextInt();
		
		System.out.println("Digite a parte da idade em MESES: ");
		mes = sc.nextInt();
		
		System.out.println("Digite a parte da idade em DIAS: ");
		dia = sc.nextInt();
		
		diaidade = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("A sua idade em dias é " + diaidade + " dias.");
		
		sc.close();
			

	}

}
