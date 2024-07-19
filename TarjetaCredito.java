public class TarjetaCredito extends CuentaBase {
 
	public TarjetaCredito(double apertura) {
		super(apertura);
	}
 
	/*
	 * Puesto que esta cuenta funciona con saldo negativo,
	 * hay que sobreescribir el método heredado getSaldo()
	 * para que muestre el monto en negativo
	 */
 
	@Override
	public double getSaldo() {
		return montoActual * -1;
	}
 
	public void sumaInteres() {
		montoActual *= 1.15; //Deuda aumenta un 15%
	}
 
}