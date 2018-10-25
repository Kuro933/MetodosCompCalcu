package clases;

public class MatrizJacobiana {

	private double [][] matrizJ;
	
	public MatrizJacobiana(int fil, int col) {
		
		matrizJ=new double[fil][col];
	}
	
	
	public double[][] armarMatrizJ(double val1,double val2, double val3, double val4) {
		
		
		matrizJ[0][0]=val1;
		matrizJ[1][0]=val2;
		matrizJ[1][0]=val3;
		matrizJ[1][1]=val4;
		return matrizJ;
	}
}