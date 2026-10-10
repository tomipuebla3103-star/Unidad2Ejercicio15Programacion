<img width="515" height="62" alt="WhatsApp Image 2026-10-05 at 23 39 55" src="https://github.com/user-attachments/assets/c8a0686d-b36d-4389-8ad1-d4ca60e1dfba" />

La Gestión de Envío de Encomiendas

 Descripción
Este proyecto consiste en un sistema en Java que permite gestionar el estado de los paquetes durante su recorrido. El centro logístico envía mensajes a los camiones de reparto para actualizar el estado de los paquetes asignados.

 Clases
- **Paquete:** almacena el código, el destino y el estado actual del paquete, que puede ser En Depósito, En Tránsito o Entregado.
- **CamionDeReparto:** contiene una lista de paquetes asignados y permite actualizar el estado de un paquete mediante su código.
- **CentroLogistico:** mantiene una colección de camiones y se encarga de enviar órdenes de actualización a los vehículos.

 Funcionamiento
En el `main` se crea un centro logístico con varios camiones y sus respectivos paquetes. Luego, el centro envía un mensaje masivo para actualizar los estados. Finalmente, se muestran por consola los resultados de las actualizaciones.

 Recorrido del mensaje
1. El programa crea los paquetes con sus códigos, destinos y estados iniciales.
2. Se crean los camiones y se les asignan los paquetes correspondientes.
3. Se agregan los camiones al centro logístico.
4. El centro logístico envía una orden de actualización a los camiones.
5. Cada camión busca el paquete indicado por su código y modifica su estado.
6. Si encuentra el paquete, actualiza su estado; si no, informa que no se encontró.
7. Finalmente, se muestran por consola los estados actualizados de los paquetes.

 Validaciones
El sistema debe comprobar que el código del paquete exista y que el nuevo estado sea válido. Los estados permitidos son En Depósito, En Tránsito y Entregado.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de colecciones, las referencias entre clases y el envío de mensajes para actualizar información de manera centralizada.
