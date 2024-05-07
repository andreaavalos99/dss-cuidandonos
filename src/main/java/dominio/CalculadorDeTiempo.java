package dominio;

public class CalculadorDeTiempo { 

    public static int minutosAproxEntre(Direccion direccion1, Direccion direccion2, int velocidadPromedio) {
        return AdapterCalculador.distanciaEnMetros(direccion1, direccion2) / velocidadPromedio;
    }

  
}
