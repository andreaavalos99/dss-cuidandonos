package dominio;

import java.util.List;

public class Trayecto {
	List<Persona> cuidadores;
	Persona transeunte;
	Direccion destinoInicial;
	Direccion destinoFinal;
	int tiempoEstimado;
	Boolean finalizado;
	List<Parada> paradas;
}
