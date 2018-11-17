
import java.util.Scanner;


public class Funciones {

	public static int PotenciaF(int x, int y){
	int potencia=x;
		for(int i=0; i<(y-1); i++) {
			potencia=potencia*x;
		}
	return potencia;
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner intro= new Scanner(System.in);
	
	int N;
	int M;
	
	System.out.println("ingrese base de la potencia");
	N=intro.nextInt();
	
	System.out.println("ingrese exponente de la potencia");
	M=intro.nextInt();
	
	int respuesta;
	respuesta=PotenciaF(N,M);
	
	System.out.println("elvalor de la potencia es " +respuesta);
	
	intro.close();
		
	}

}
