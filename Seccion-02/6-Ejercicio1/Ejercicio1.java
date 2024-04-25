class Ejercicio1{
    public static void main(String[] args) {
        // Se hace una instancia usando la clase padre y definiendo con
        // la clase hijo.
        Animal felix = new Gato();
        Animal fido = new Perro();

        try {
            // Antes
            felix.sonido();
            // Despues
        } catch (Exception exception) { //Todas las Excepciones (errores) heredan de Exception
            // Se ejecuta todo el Antes y el error
            System.err.println("UPS ocurrio un error");
        }

        // Se continua con normalidad
        fido.sonido();
    }
}