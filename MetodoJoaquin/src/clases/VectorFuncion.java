package clases;

public class VectorFuncion {
	private double[][] vectorF;
	public VectorFuncion() {
		vectorF=new double[2][1];
	}
	
	public double[][] armarVectorF(double val1, double val2) {
		vectorF[0][0]=val1;
		vectorF[1][0]=val2;
		return vectorF;
	}
}