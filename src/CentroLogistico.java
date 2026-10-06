public class CentroLogistico {
    CamionDeReparto[] camiones;
    int cantidadCamiones;

    public CentroLogistico() {
        camiones = new CamionDeReparto[10];
        cantidadCamiones = 0;
    }

    public void agregarCamion(CamionDeReparto camion) {
        camiones[cantidadCamiones] = camion;
        cantidadCamiones++;
    }

    public void difundirActualizacion(String codigoPaquete, String nuevoEstado) {
        for (int i = 0; i < cantidadCamiones; i++) {
            camiones[i].actualizarEstadoPaquete(codigoPaquete, nuevoEstado);
        }
    }
}
