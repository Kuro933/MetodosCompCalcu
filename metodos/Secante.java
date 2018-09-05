package metodos;

public class Secante {

	public static void main(String[] args) {
		System.out.println(Msecante(1.5 , 1.8 , 0.00001));
		
	}
	
	
	public static double Msecante(double a, double b , double err) {
		double resultado=0;
		int iteracion=0;
		do {
		resultado = (b - (f(b) * (b - a))/ (f(b) - f(a)));
		iteracion += 1;
		a = b;
		b = resultado;
		}while(Math.abs(f(resultado))>=err);
	
		System.out.println(iteracion);
		return resultado;
	}
	
	
	public static double f(double a) {
		return (Math.pow(a, 3) - (2*a) - 1);		
	}
}
