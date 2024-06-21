import java.sql.*;

public class DBTest {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","8!Wts@^8f#5RaR");

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from persona");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
