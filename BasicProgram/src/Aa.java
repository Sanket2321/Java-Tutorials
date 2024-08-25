import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Aa {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sanket", "root", "1234");
        //PreparedStatement ps = con.prepareStatement("create table customer(id int, name varchar(20))");
        Scanner scr =new Scanner(System.in);
       // PreparedStatement ps=con.prepareStatement("insert into customer values(?,?)");
        //System.out.println("Enter id");
        //int id=scr.nextInt();
        //System.out.println("Enter the name:");
        //String name=scr.next();
        //ps.setInt(1, id);
        //ps.setString(2,name);
        //ps.executeUpdate();
       /* PreparedStatement ps=con.prepareStatement("select * from customer where name=?");
        System.out.println("Enter name");
        String x=scr.next();
        ps.setString(1, x);
        ResultSet rs=ps.executeQuery();
        rs.next();
        System.out.println(rs.getInt("id")+" "+rs.getString("name"));*/
        
        PreparedStatement ps=con.prepareStatement("update customer set name=? where id=?");
        
    }
}
