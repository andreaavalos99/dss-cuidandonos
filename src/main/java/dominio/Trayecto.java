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
	int velocidadPromedio;
	
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
	
	public void agregarParada(Parada parada,int orden ) {
		paradas.add(orden, parada);
	}
	
	
	 public void calcularTiempoEstimado() {
	    int tiempoDemorado = paradas.stream().mapToInt(Parada::getTiempoDetenido).sum();
	    int tiempoEntreParadas = calcularTiempoEntreParadas();
	    this.tiempoEstimado = tiempoDemorado + tiempoEntreParadas;
	 }

	 private int calcularTiempoEntreParadas() {
	    if (paradas.size() <= 1) {
	       return 0;
	    }
	    return paradas.stream().mapToInt(parada -> {
	    	int indiceParada = paradas.indexOf(parada);
	    	if (indiceParada < paradas.size() - 1) {
	        Parada siguienteParada = paradas.get(indiceParada + 1);
	        return CalculadorDeTiempo.minutosAproxEntre(parada.getDireccion(), siguienteParada.getDireccion(), velocidadPromedio);
	        } else {
	        	   return 0; // La última parada no tiene tiempo entre paradas
	        	   }
	    	}).sum();
	    }	  
	
}
