
public class senhabanco {

	public static void main(String[] args) {
		
		//Condi��es da Senha:
		//Senha n�o pode ter mais de 4 d�gitos
		//Senha n�o pode iniciar com 0
		//Pra saber o tamanho da Array = variavel.lenght
		
		int [] senha = {0, 3, 2, 1};
		
		if (senha.length == 4 && senha[0] != 0) {
			System.out.println("Senha V�lida!");
		} else {
			System.out.println("Senha Inv�lida!");
		}

	}

}
