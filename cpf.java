
public class cpf {

	public static void main(String[] args) {
		
		//Regras de validação CPF:
		//Pegar cada digito e multiplicar por 10 fatorial
		//Soma cada multiplicação de cada dígito
		//Divide a soma por 11
		//Se o resto da divisão por menor que dois, o primeiro dígito é 0
		//Senão, o primeiro dígito vai ser a subtração de 11 - resto da divisão
		
		int [] cpf = {1, 1, 1, 4, 4, 4, 7, 7, 7, 3, 5};
		
		int primdig;
		int segdig;
				
		int parteum = (cpf[0] * 10) + 
				      (cpf[1] * 9) +
				      (cpf[2] * 8) +
				      (cpf[3] * 7) + 
				      (cpf[4] * 6) + 
				      (cpf[5] * 5) +
				      (cpf[6] * 4) + 
				      (cpf[7] * 3) + 
				      (cpf[8] * 2);
		
		int restoum = parteum % 11;
					
		if (restoum < 2) {
			primdig = 0; 			
		}  else {
			primdig = 11 - (restoum);	
		}
		
		System.out.println("O Primeiro Dígito Verificador é: " + primdig);
		
		int partedois = (cpf[0] * 11) +
						(cpf[1] * 10) +
						(cpf[2] * 9) +
						(cpf[3] * 8) +
						(cpf[4] * 7) +
						(cpf[5] * 6) +
						(cpf[6] * 5) +
						(cpf[7] * 4) +
						(cpf[8] * 3) +
						(cpf[9] * 2);
		
		int restodois = partedois % 11;
		
		if (restodois < 2) {
			segdig = 0; 			
		}  else {
			segdig = 11 - (restodois);	
		}
				
		System.out.println("O Segundo Dígito Verificador é: " + segdig);
		
		
		
		
		if (cpf[9] == primdig && cpf[10] == segdig) {		
			System.out.println("CPF Válido!");
		} else {
			System.out.println("CPF Inválido!");
		}
		
		
		/*
		int [] cpf = {1, 1, 1, 4, 4, 4, 7, 7, 7, 3, 5};
		int [] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
		
		int soma = (cpf[0] * pesos[0]) + 
				   (cpf[1] * pesos[1]) + 
				   (cpf[2] * pesos[2]) +
				   (cpf[3] * pesos[3]) + 
				   (cpf[4] * pesos[4]) + 
				   (cpf[5] * pesos[5]) +
				   (cpf[6] * pesos[6]) + 
				   (cpf[7] * pesos[7]) + 
				   (cpf[8] * pesos[8]);
		
		int resto = soma % 11;
		int digitoEsperado;
		
		if (resto < 2) {
			digitoEsperado = 0;		
		} else { 
			digitoEsperado = 11 - resto;
		}
		
		int primeiro_digito_verificador = cpf[9];
		
		if (primeiro_digito_verificador == digitoEsperado) {
			System.out.println("CPF Válido!");
		} else {
			System.out.println("CPF Inválido!");
		} */
		
		
			
			
						
		}

		
	}

