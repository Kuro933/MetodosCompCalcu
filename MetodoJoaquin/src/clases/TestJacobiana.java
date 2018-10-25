package clases;

public class TestJacobiana {

	public static void main(String[] args) {
		MatrizJacobiana matriz = new MatrizJacobiana(2, 2);
		double error = 0.001;
		VectorFuncion vectorInicial = new VectorFuncion();
		VectorFuncion vectorFuncion = new VectorFuncion();

		vectorInicial.armarVectorF(0.25, 0.15);
		vectorFuncion.armarVectorF(((-1) *  funcionUno(0.25, 0.15)),  ((-1) * funcionDos(0.25 , 0.15)));
		
		
		matriz.armarMatrizJ(funcionJacoUno(0.25), funcionJacoDos(0.15), funcionJacoTres(0.25), funcionJacoCuatro(0.15));
		
	}

	public static double funcionUno(double x, double y) {
		return ((Math.pow(x, 4)) + (0.06823 * x) - ((Math.pow(y, 4)) + (0.05848 * y)));
	}

	public static double funcionDos(double x, double y) {
		return ((Math.pow(x, 4)) + (0.05848 * x) - ((2 * (Math.pow(y, 4))) + (0.11696 * y)));
	}

	
	public static double funcionJacoUno(double x) {
		return (4 * (Math.pow(x, 3)) + 0.06823);
	}

	public static double funcionJacoDos(double y) {
		return (-4 * (Math.pow(y, 3)) - 0.05848);
	}

	public static double funcionJacoTres(double x) {
		return (4 * (Math.pow(x, 3)) + 0.05848);
	}

	public static double funcionJacoCuatro(double y) {
		return (-8 * (Math.pow(y, 3)) - 0.11696);
	}
}
