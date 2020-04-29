
public class Imc {
	
	// my first program in java language
	// this project didn't have user interaction
	// the variables we're already declared
	// the objective of this program is to classify pleople BMI/IMC

	public static void main(String[] args) {
		int peso = 82;
        float altura = 1.82f;
	    float imc = peso / (altura * altura);
	    
	       if (imc < 20) {
	    	   System.out.println("Abaixo do Peso");
	        
	       }  else if (imc >= 20 && imc < 25) {
	    	   System.out.println("Peso Normal");
	        
	       }  else if (imc >= 25 && imc < 30) {
	    	   System.out.println("Sobre Peso");
	        
	       }  else if (imc >= 30 && imc < 40) {
	    	   System.out.println("Obeso");
	    	   
	       }  else if (imc >= 40) {
	    	   System.out.println("Obeso Mórbido");
	       }
		
	}

}
