package dominio;

public interface AdapterCalculador {
	static int distanciaEnMetros(Direccion direccionInicial, Direccion direccionFinal) {
	
		return DistanceMatrixAPI.distanciaEnMetrosEntre(direccionInicial, direccionFinal);
	}
}
