
public class Progmedia {

	public static void main(String[] args) {
		
		int[] med1 = new int[3];
		
		int prim, seg, soma, media;
		
		med1[0] = 8;
		med1[1] = 9;
		med1[2] = 7;
	   
		prim = (med1[0] + med1[1] + med1[2]);
		prim = prim / med1.length;
		
		System.out.println("A primeira média é: " + prim);
		
		int[] med2 = new int[3];
		
		med2[0] = 4;
		med2[1] = 5;
		med2[2] = 6;
	   
		seg = (med2[0] + med2[1] + med2[2]);
		seg = seg / med2.length;
		
		System.out.println("A segunda média é: " + seg);
		
		soma = prim + seg;
		
		System.out.println("A soma das médias é: " + soma);
		
		media = soma / 2;
		
		System.out.println("A média da primeira e segunda média é: " + media);
		
	}

}
