package menufactory.menu;

public class MenuCliente implements Menu {
    @Override
    public void show() {
        System.out.println("¿Qué opción desea realizar el día de hoy?\n"
                +"===========================================\n"
                +"1. Ver Habitaciones\n"
                +"2. Reservar Habitación\n"
                +"3. Solicitar actualizaciones\n"
                +"4. Cancelar actualizaciones\n"
                +"5. Hacer Check-In\n"
                +"6. Hacer Check-Out\n"
                +"7. Ver Reservas\n"
                +"8. Eliminar Reserva\n"
                +"0. Salir\n");
    }
}
