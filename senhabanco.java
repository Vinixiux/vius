
public class senhabanco {

	public static void main(String[] args) {
		
		//Condições da Senha:
		//Senha não pode ter mais de 4 dígitos
		//Senha não pode iniciar com 0
		//Pra saber o tamanho da Array = variavel.lenght
		
		int [] senha = {0, 3, 2, 1};
		
		if (senha.length == 4 && senha[0] != 0) {
			System.out.println("Senha Válida!");
		} else {
			System.out.println("Senha Inválida!");
		}

	}

}
