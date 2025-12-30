import java.sql.*;
public class Test{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "");
            System.out.println("Connected");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Failed"+e.getMessage());
        }
    }
}