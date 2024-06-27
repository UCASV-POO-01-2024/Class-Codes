import java.sql.*;

public class Main {
    public static void main(String[] args) {
        insertarPalabra("Hola", "Mundo");
        insertarPalabra("eliminar", "Adios");
        insertarPalabra("Hola2", "Mundo2");
        System.out.println();

        mostrarPalabras();
        System.out.println();

        mostrarPalabra("hola");
        System.out.println();

        borrarPalabra("eliminar");
        System.out.println();

        modificarPalabra("Hola2", "He cambiado dame una oportunidad");
        System.out.println();

        mostrarPalabras();
        System.out.println();

        borrarTodo();
        System.out.println();

        mostrarPalabras();
    }

    private static void insertarPalabra(String palabra, String definicion){
        // Connection URL
        // <driver>:<gestor de base de datos>://<servidor>:<puerto>/<base de datos>

        // There's no place like 127.0.0.1
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tbTabla VALUES(?,?)");
            ps.setString(1, palabra);
            ps.setString(2, definicion);

            int affectedRows = ps.executeUpdate();

            System.out.println(affectedRows+" affected row(s)");

            conn.close();

        } catch (SQLIntegrityConstraintViolationException e){
            System.out.println("Palabra duplicada");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void modificarPalabra(String palabra, String definicion){
        // Connection URL
        // <driver>:<gestor de base de datos>://<servidor>:<puerto>/<base de datos>

        // There's no place like 127.0.0.1
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );
            PreparedStatement ps = conn.prepareStatement("UPDATE tbTabla SET definicion = ? WHERE palabra = ?");
            ps.setString(1, definicion);
            ps.setString(2, palabra);

            int affectedRows = ps.executeUpdate();

            System.out.println(affectedRows+" affected row(s)");

            conn.close();

        } catch (SQLIntegrityConstraintViolationException e){
            System.out.println("Palabra duplicada");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void borrarTodo(){
        // Connection URL
        // <driver>:<gestor de base de datos>://<servidor>:<puerto>/<base de datos>

        // There's no place like 127.0.0.1
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tbTabla");
            int affectedRows = ps.executeUpdate();

            System.out.println(affectedRows+" affected row(s)");

            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void borrarPalabra(String palabra){
        // Connection URL
        // <driver>:<gestor de base de datos>://<servidor>:<puerto>/<base de datos>

        // There's no place like 127.0.0.1
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tbTabla WHERE palabra=?");
            ps.setString(1, palabra);
            int affectedRows = ps.executeUpdate();

            System.out.println(affectedRows+" affected row(s)");

            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void mostrarPalabras(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbTabla");

            System.out.println("Palabra\tDefinicion");
            while(rs.next()){
                System.out.println(rs.getString("palabra")+"\t"+rs.getString("definicion"));
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void mostrarPalabra(String palabra){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbCrud",
                    "pooadmin",
                    "pooadmin"
            );

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT palabra, definicion FROM tbTabla WHERE palabra = '"+palabra+"'");

            System.out.println("Palabra seleccionada");
            while(rs.next()){
                System.out.println(rs.getString(1)+": "+rs.getString(2));
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}