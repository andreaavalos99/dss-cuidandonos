package dominio;

public class CalculadorDeTiempo { 

    public static int minutosAproxEntre(Direccion direccion1, Direccion direccion2, int velocidadPromedio) {
        // velocidadPromedio en km/h
        int distancia = AdapterCalculador.distanciaEnMetros(direccion1, direccion2);
        return distancia/(velocidadPromedio*1000/60);
    }

}

