public class TarjetaDebito extends CuentaBase {
 
	public TarjetaDebito(double apertura) {
		super(apertura);
	}
 
	public void retirar(double cantidad) {
		if (cantidad > montoActual)
			System.out.println("No hay suficiente saldo para cubrir la retirada");
		else
			montoActual -= cantidad;
	}
}