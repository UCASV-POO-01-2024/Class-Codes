import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        agregarPalabra("arbol", "planta");
        agregarPalabra("naranjo", "arbol de frutas");
        agregarPalabra("manazano", "arbol de frutas");
        System.out.println();

        listarPalabras();
        System.out.println();

        modificarPalabra("arbol", "planta muy grande");
        System.out.println();

        buscarPalabra("arbol");
        System.out.println();

        eliminarPalabra("arbol");
        System.out.println();

        listarPalabras();
        System.out.println();

        eliminarTodo();
        System.out.println();

        listarPalabras();

    }

    private static void listarPalabras(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM definiciones");

            System.out.println("Registros de palabras:");
            while(rs.next()){
                System.out.println(rs.getString("palabra")+": "+rs.getString("definicion"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    private static void buscarPalabra(String palabra){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            Statement st = conn.createStatement();
            String consulta = "SELECT definicion FROM definiciones WHERE palabra = '"+palabra+"'";
            ResultSet rs = st.executeQuery(consulta);

            System.out.println("Resultados de "+palabra+":");
            while(rs.next()){
                System.out.println(palabra+": "+rs.getString("definicion"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    private static void agregarPalabra(String palabra, String definicion) {
        // La URL sigue el siguiente formato:
        // <driver>:<gestor de BD>://<servidor>:<puerto>/<nombre de la BD>
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            PreparedStatement st = conn.prepareStatement("INSERT INTO definiciones VALUES(?,?)");
            st.setString(1, palabra);
            st.setString(2, definicion);

            try{
                int results = st.executeUpdate();
                System.out.println(results+" fila(s) afectada(s)");
            } catch (SQLException e){
                System.out.println("Palabra duplicada");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    //Tarea: Implementar agregar multiples palabras
    private static void agregarMultiples(ArrayList<Palabra> palabras) {
        // La URL sigue el siguiente formato:
        // <driver>:<gestor de BD>://<servidor>:<puerto>/<nombre de la BD>
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            PreparedStatement st = conn.prepareStatement("INSERT INTO definiciones VALUES(?,?)");

            // En caso de querer agregar multiples elementos de forma simultanea se usa st.addBatch()
            /*for (...){
                st.setString(1, palabra);
                st.setString(2, definicion);
                st.addBatch();
            }*/

            try{
                int results = st.executeUpdate();
                System.out.println(results+" fila(s) afectada(s)");
            } catch (SQLException e){
                System.out.println("Palabra duplicada");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    private static void modificarPalabra(String palabra, String definicion) {
        // La URL sigue el siguiente formato:
        // <driver>:<gestor de BD>://<servidor>:<puerto>/<nombre de la BD>
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            PreparedStatement st = conn.prepareStatement("UPDATE definiciones SET definicion=? WHERE palabra=?");
            st.setString(1, definicion);
            st.setString(2, palabra);

            try{
                int results = st.executeUpdate();
                System.out.println(results+" fila(s) afectada(s)");
            } catch (SQLException e){
                System.out.println("Error al actualizar");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    private static void eliminarPalabra(String palabra) {
        // La URL sigue el siguiente formato:
        // <driver>:<gestor de BD>://<servidor>:<puerto>/<nombre de la BD>
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            PreparedStatement st = conn.prepareStatement("DELETE FROM definiciones WHERE palabra=?");
            st.setString(1, palabra);

            try{
                int results = st.executeUpdate();
                System.out.println(results+" fila(s) afectada(s)");
            } catch (SQLException e){
                System.out.println("Error al eliminar");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }

    private static void eliminarTodo() {
        // La URL sigue el siguiente formato:
        // <driver>:<gestor de BD>://<servidor>:<puerto>/<nombre de la BD>
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

            PreparedStatement st = conn.prepareStatement("DELETE FROM definiciones");

            try{
                int results = st.executeUpdate();
                System.out.println(results+" fila(s) afectada(s)");
            } catch (SQLException e){
                System.out.println("Error al eliminar");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Fallo al conectar la Base de Datos");
        }
    }
}