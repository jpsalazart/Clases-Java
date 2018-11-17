import java.util.Scanner;
public class funciones2 {

	public static int fibonacci(int N){
		
		int a=0;
		int b=1;
		int suma=0;
		
		for(int i=0; i<N; i++){
			suma=a+b;
			a=b;
			b=suma;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner intro= new Scanner(System.in);
		
	int N;
	int respuesta;
	
	System.out.println("Ingrese un número ");
	N=intro.nextInt();
	
	respuesta=fibonacci(N);
	System.out.println("El número de la serie Fibonacci es "+respuesta);
		
	intro.close();
		
	}

}
