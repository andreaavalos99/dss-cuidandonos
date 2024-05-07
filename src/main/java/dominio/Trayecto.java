package dominio;

import java.util.ArrayList;
import java.util.List;

public class Trayecto {
	List<Persona> cuidadores;
	Persona transeunte;
	Direccion direccionInicial;
	Direccion direccionFinal;
	int tiempoEstimado;
	Boolean finalizado;
	ArrayList<Parada> paradas = new ArrayList<>();
	
	public List<Persona> getCuidadores() {
		return cuidadores;
	}

	public void setCuidadores(List<Persona> cuidadores) {
		this.cuidadores = cuidadores;
	}

	public Persona getTranseunte() {
		return transeunte;
	}

	public void setTranseunte(Persona transeunte) {
		this.transeunte = transeunte;
	}

	public Direccion getDireccionInicial() {
		return direccionInicial;
	}

	public void setDireccionInicial(Direccion direccionInicial) {
		this.direccionInicial = direccionInicial;
	}

	public Direccion getDireccionFinal() {
		return direccionFinal;
	}

	public void setDireccionFinal(Direccion direccionFinal) {
		this.direccionFinal = direccionFinal;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public List<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(ArrayList<Parada> paradas) {
		this.paradas = paradas;
	}
	
	public int calcularTiempoEstimado() {
		
		return tiempoEstimado;		
	    }

	
	public void agregarParada(Parada parada,int orden ) {
		paradas.add(orden +1, parada);
	}

}
