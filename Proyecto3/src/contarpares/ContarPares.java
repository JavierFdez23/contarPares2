package contarpares;

public class ContarPares {

	public static void main(String[] args) {
		int contadorPares = 0;
		for (int i = 0; i <= 500; i++) {
			if (i % 2 == 0)
				contadorPares++;
		}
		//imprimir resultado para saber si es par o no
		System.out.println("Hay " + contadorPares + " numeros pares del 0 al 50");
	}

}
