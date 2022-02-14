package suma;

public class vector {
	
	public static void main (String[] args) {
		
		int n=5, resultado=0;
		int a[]= new int [n];
		for  (int i=0; i<n; i++) {
			a[i]=(i+1)*10;
		}
		for  (int i=0; i<n; i++) {
			resultado += a[i];
		}
		System.out.println("La media es "+resultado);
		System.out.printf("La media calculada es %d",resultado);		
	}
	
	public static void visualizarVector (int[] vector) {
		
		for (int i=0; i<vector.length; i++) {
			System.out.printf("Elemento %d=%d\n",i, vector[i]);
			
		}
		
	}

}
