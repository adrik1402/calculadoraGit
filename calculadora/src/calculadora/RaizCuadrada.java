package calculadora;

public class RaizCuadrada extends EstructuraSimple{
	private double raiz;
	
	public RaizCuadrada(double n1) {
		super(n1, "raiz");
		n1=Math.sqrt(n1);
		this.raiz=Math.sqrt(n1);
		this.setResultadoSimple(this.raiz);
	}
}
