//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;



public class HotelReservationSystem {

    private static final String url ="jdbc:mysql://localhost:3306/hotel_db";

    private static final String user ="root";

    private static final String password ="chirag@123";



    public static void main(String[] args) throws ClassNotFoundException ,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (ClassNotFoundException e){
        System.out.println();








    }
}