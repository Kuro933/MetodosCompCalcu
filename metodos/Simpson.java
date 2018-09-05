package metodos;

public class Simpson {

	public static void main(String[] args) {
		System.out.println(simpson(2.8,5.2,8));
	}
	
	public static double simpson(double a, double b, int cantAreas) {
		double sumImp=0, sumPar = 0 ,h,resultado = 0,temp;
		h = ((b - a)/cantAreas);
		temp = a + h;
		
		for(int i=1;i<cantAreas;i++) {
			
			if((i%2)==0) {
			sumPar = sumPar + f2(temp);
			}else {
			sumImp = sumImp + f2(temp);
			}
			
			temp = temp + h;
		}
		
		resultado = ((h/3) * (f2(a) + f2(b) + (4 * sumImp) + (2 * sumPar)));
		
		return resultado;
	}
	
	public static double f(double a) {
		return (5*Math.pow(a, 2) + (2*a) - 3);
	}
	
	public static double f2(double a) {
		return (Math.pow(Math.E, a));
	}
}
	
