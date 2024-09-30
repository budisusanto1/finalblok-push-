/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudangbudi;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException ;
/**
 *
 * @author HP
 */
public class koneksi {
    private final String url="jdbc:mysql://localhost/gudang3";
    private final String username_xampp="root";
    private final String password_xampp="";
    private Connection con ;
    public void connect(){
    try {
        con= DriverManager.getConnection(url,username_xampp,password_xampp);
        System.out.println("koneksi berhasil");
    } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
    public Connection getcon(){
        return con;
    }

    Object getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


