public class CuentaAhorro extends CuentaBase {
 
	public CuentaAhorro(double apertura) {
		super(apertura);
	}
 
	public void invertir() {
		montoActual *= 1.10; //Se invierte un 10% del monto actual
	}
}