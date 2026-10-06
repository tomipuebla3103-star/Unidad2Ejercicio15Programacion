public class CamionDeReparto {
    String patente;
    Paquete[] paquetes;
    int cantidadPaquetes;

    public CamionDeReparto(String patente) {
        this.patente = patente;
        paquetes = new Paquete[10];
        cantidadPaquetes = 0;
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes[cantidadPaquetes] = paquete;
        cantidadPaquetes++;
    }

    public void actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {
        for (int i = 0; i < cantidadPaquetes; i++) {
            if (paquetes[i].codigo.equals(codigoPaquete)) {
                paquetes[i].estado = nuevoEstado;
            }
        }
    }
}
