package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		suma();
	}
	
	//estoy generando un conflicto en rama de pruebas

	public static void suma() {
		int a,b, resultado;
		String respuesta="s";
		
		try {
		Scanner teclado =new Scanner(System.in);
		while (respuesta.equalsIgnoreCase("s")){
			System.out.println("Introduce un número positivo:");
			a=teclado.nextInt();
			System.out.println("Introduce otro número positivo:");
			
			//estoy modificando desde la rama de pruebas
			//estoy modificando desde la rama de pruebas
			//estoy modificando desde la rama de pruebas
			
			b=teclado.nextInt();
			if ((a > 0) && (b >0)) {
				resultado= a+b;
				System.out.println("El resultado es::: " + resultado);
				System.out.println("Linea insignificante");
				System.out.println("Linea dos realizada desde remoto");
				
			}
			else {
				System.out.println("No son positivos");
			}
			System.out.println("¿Quieres seguir sumando? s/n");
			respuesta=teclado.next();
		}
		teclado.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
