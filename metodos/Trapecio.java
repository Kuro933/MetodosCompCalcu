package metodos;

public class Trapecio {

	public static void main(String[] args) {
		System.out.println(trapecio(2.8,5.2,8));
	}
	
	public static double trapecio(double a, double b, int cantAreas) {
		double sum=0, h,resultado = 0,temp;
		h = ((b - a)/cantAreas);
		temp = a + h;
		
		for(int i=1;i<cantAreas;i++) {
			sum = sum + f2(temp);
			temp = temp + h;
		}
		
		resultado = ((h/2) * (f2(a) + f2(b) + (2 *sum)));
		
		return resultado; 
	}
	
	public static double f(double a) {
		return (5*Math.pow(a, 2) + (2*a) - 3);
	}
	
	public static double f2(double a) {
		return (Math.pow(Math.E, a));
	}
	
}
