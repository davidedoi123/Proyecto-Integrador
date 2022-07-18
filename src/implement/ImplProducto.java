package implement; 

import conexion.ConexionMysql;
import entities.Producto;
import resources.Resources;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class ImplProducto {
    Producto prod = new Producto();
    Resources resources= new Resources();
    conexion.ConexionMysql cx= new ConexionMysql();
    String  sql=""; 
    Statement stmt=null;
    ArrayList<Producto> lisproductos = new ArrayList<>();
    
    public void AddProducto(Producto pr){
        try {
            int i=0;
            sql =" INSERT INTO PRODUCTO "
                +" VALUES('"+pr.getProd_id()+"','"+pr.getProd_nombre()+"','"+pr.getProd_stock()+"','"+pr.getProd_precioveta()+"','"+pr.getProd_preciocompra()+"')  ";
                   
                    System.out.println("sql:"+ sql );
                    stmt=cx.conectaDB().createStatement();
                    i=stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ImplProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public ArrayList<Producto> reporteProductos(){
        lisproductos = new ArrayList<>();
        try {
            sql=" select * from producto ";
            stmt=cx.conectaDB().createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                Producto ps = new Producto();
                ps.setProd_id(rset.getString(1));
                ps.setProd_nombre(rset.getString(2));
                ps.setProd_stock(rset.getString(3));
                ps.setProd_preciocompra(rset.getDouble(5));
                ps.setProd_precioveta(rset.getDouble(4));
                
                
                lisproductos.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return lisproductos;
    }

    public void AddProducto(JComboBox<String> jComboBoxpRODUCTOS ) {
           Producto pr=new Producto();
        try {
            int i=0;
            sql =" INSERT INTO PRODUCTO "
                +" VALUES('"+pr.getProd_id()+"','"+pr.getProd_nombre()+"','"+pr.getProd_stock()+"','"+pr.getProd_precioveta()+"','"+pr.getProd_preciocompra()+"')  ";
                   
                    System.out.println("sql:"+ sql );
                    stmt=cx.conectaDB().createStatement();
                    i=stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ImplProducto.class.getName()).log(Level.SEVERE, null, ex);
        }    }


    
}
