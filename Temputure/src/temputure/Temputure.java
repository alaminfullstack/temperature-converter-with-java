/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temputure;
import java.sql.*;
/**
 *
 * @author User
 */
public class Temputure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
          String sql = "select * from users";
          stmt = con.prepareStatement(sql);
          stmt.setInt(1, 1);
          rs = stmt.executeQuery();
          while(rs.next()){
          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getString(4));
          }
          rs.close();
          stmt.setInt(2, 2);
          rs = stmt.executeQuery();
          while(rs.next()){
          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getString(4));
          }
        }catch(Exception e){
        System.out.println("error");
        }
        finally{
        try{
        if(rs != null)
            rs.close();
        if(stmt != null)
            stmt.close();
        if(con != null)
            con.close();
        
        
        }catch(Exception e){
        System.out.println("wrong");
        }
        }
    }
    
}
