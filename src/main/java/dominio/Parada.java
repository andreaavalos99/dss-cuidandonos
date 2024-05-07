package dominio;

public class Parada {
	Direccion direccion;
	int tiempoDetenido;
	Boolean avisaEstadoSalud;
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getTiempoDetenido() {
		return tiempoDetenido;
	}
	public void setTiempoDetenido(int tiempoDetenido) {
		this.tiempoDetenido = tiempoDetenido;
	}
	public Boolean getAvisaEstadoSalud() {
		return avisaEstadoSalud;
	}
	public void setAvisaEstadoSalud(Boolean avisaEstadoSalud) {
		this.avisaEstadoSalud = avisaEstadoSalud;
	}
	
}
