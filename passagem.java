
public class passagem {

	public static void main(String[] args) {
		// Destinos:
		// Região Norte = 1
		// Região Nordeste = 2
		// Região Centro-Oeste = 3
		// Região Sul = 4
		
		//Ida:
		//Norte = 500
		//Nordeste = 350
		//Centro-Oeste = 350
		//Sul = 300
		
		//Retorno:
		//Norte = 900
		//Nordeste = 650
		//Centro-Oeste = 600
		//Sul = 550
		
		int destino = 3;
		boolean retorno = false;
		
		String valor = "";
		
		
		if (destino == 1 && retorno) {
			valor = "O valor da passagem de ida e volta é: R$900,00";
		} else if (destino == 1) { 
			valor = ("O valor da passagem de ida e volta é: R$500,00");
		} else if (destino == 2 && retorno) {
			valor = ("O valor da passagem de ida e volta é: R$650,00");
		} else if (destino == 2) { 
			valor = ("O valor da passagem de ida e volta é: R$350,00");
		} else if (destino == 3 && retorno) {
			valor = ("O valor da passagem de ida e volta é: R$600,00");
		} else if (destino == 3) { 
			valor = ("O valor da passagem de ida e volta é: R$350,00");
		} else if (destino == 4 && retorno) {
			valor = ("O valor da passagem de ida e volta é: R$550,00");
		} else if (destino == 4) { 
			valor = ("O valor da passagem de ida e volta é: R$300,00");
		}
		
		System.out.println(valor);
		
		//-------------------------------------------------------------
		/*
		switch (destino) {
		
		case 1: valor = retorno ? "R$ 900" : "R$500";
		break;
		
		case 2: valor = retorno ? "R$ 650" : "R$350";
		break;
		
		case 3: valor = retorno ? "R$ 600" : "R$350";
		break;
		
		case 4: valor = retorno ? "R$ 550" : "R$300";
		break;
		}
		
		System.out.println(valor); */
		
	
		
	
		
		}

	}
