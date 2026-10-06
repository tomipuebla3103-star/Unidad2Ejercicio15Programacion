void main() {
    CentroLogistico centro = new CentroLogistico();

    CamionDeReparto camion1 = new CamionDeReparto("ABC123");
    CamionDeReparto camion2 = new CamionDeReparto("DEF456");

    Paquete paquete1 = new Paquete(
            "P001",
            "Mendoza",
            "En Depósito"
    );

    Paquete paquete2 = new Paquete(
            "P002",
            "San Juan",
            "En Depósito"
    );

    camion1.agregarPaquete(paquete1);
    camion2.agregarPaquete(paquete2);

    centro.agregarCamion(camion1);
    centro.agregarCamion(camion2);

    centro.difundirActualizacion("P001", "En Tránsito");
    centro.difundirActualizacion("P002", "En Tránsito");

    System.out.println("Paquete 1: " + paquete1.estado);
    System.out.println("Paquete 2: " + paquete2.estado);
}
