/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mysql.cj.xdevapi.Result;
import conexion.ConexionMysql;
import entities.Client;
import entities.DetailSales;
import entities.Producto;
import entities.Sales;
import implement.ImplPerson;
import implement.ImplProducto;
import implement.ImplSales;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import resources.Resources;

/**
 *
 * @author LAB REDES
 */
public class JIFSalesGUI extends javax.swing.JInternalFrame {
Resources r= new Resources();
Resources re= new Resources();
     DefaultTableModel modelo;
     String datos [][]={};
     ConexionMysql con= new ConexionMysql();
     Connection cn = con.conectaDB();
     //ImplProducto prod= new ImplProducto();
    // String head []={"producto","precio","cantidad","Subtotal"};
    public JIFSalesGUI() {
        
        
        initComponents();
        tablaEncabezado();
        cargarCombo(jComboBoxpRODUCTOS);
        //prod.AddProducto(jComboBoxpRODUCTOS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelCLIENTE = new javax.swing.JLabel();
        jComboBoxpRODUCTOS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelCLIENTE1 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jButtonAgregarProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton_ConfirmarVenta = new javax.swing.JButton();
        jTextFieldPrecioUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "PRECIO UNIT", "SUBTOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTableDetalle);

        jTextField1.setEditable(false);

        jLabel2.setText("TOTAL:");

        jLabelCLIENTE.setText("DIRECCION");

        jComboBoxpRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxpRODUCTOSActionPerformed(evt);
            }
        });

        jLabel1.setText("PRODUCTOS:");

        jLabelCLIENTE1.setText("CLIENTE:");

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jButtonAgregarProductos.setText("AGREGAR");
        jButtonAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProductosActionPerformed(evt);
            }
        });

        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("TIENDAS LA PRIMERA");

        jButton_ConfirmarVenta.setText("CONFIRMAR VENTA");
        jButton_ConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarVentaActionPerformed(evt);
            }
        });

        jTextFieldPrecioUnitario.setText("0.0");

        jLabel5.setText("Precio Unit.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jButtonAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jButton_ConfirmarVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarProductos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addComponent(jButton_ConfirmarVenta)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    
    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jComboBoxpRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxpRODUCTOSActionPerformed
        /*int i;
        i = jComboBoxpRODUCTOS.getSelectedIndex();
            if(i==0){
            jTextFieldPrecioUnitario.setText("0.0");
            }else if(i==1){
            jTextFieldPrecioUnitario.setText("0.5");
            }else if(i==2){
            jTextFieldPrecioUnitario.setText("2.0");
            }else{
            jTextFieldPrecioUnitario.setText("1.0");
            }*/
    }//GEN-LAST:event_jComboBoxpRODUCTOSActionPerformed

    public void tablaEncabezado(){
       modelo = new DefaultTableModel();
            
            modelo.addColumn("cantidad");
            modelo.addColumn("producto");
            modelo.addColumn("PU");
            modelo.addColumn("subtotal");
    }
    private void jButtonAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProductosActionPerformed
        /*String pro, pre, can, sub;
        int cant;
        double precio , subtotal,total;
        cant = Integer.parseInt(jSpinnerCantidad.getValue().toString());
        precio = Double.parseDouble(jTextFieldPrecioUnitario.getText());
        subtotal =precio * cant;
        total= Double.parseDouble(jTextField1.getText());
        total= total + subtotal;
        pro = jComboBoxpRODUCTOS.getSelectedItem().toString();
        pre= ""+precio;
        can= ""+ cant;
        sub= ""+ subtotal;
        String datos []={pro,pre,can,sub}; 
        jTextField1.setText(""+ total);*/
        
        
        Object[] fila = new Object[4];
                    fila[0] = jSpinnerCantidad.getValue().toString();
                    fila[1] = jComboBoxpRODUCTOS.getSelectedItem().toString();
                    fila[2] = jTextFieldPrecioUnitario.getText();
                    fila[3] = Double.parseDouble(jSpinnerCantidad.getValue().toString())   *   Double.parseDouble(jTextFieldPrecioUnitario.getText());
                    

                    modelo.addRow(fila);
                
           jTableDetalle.setModel(modelo); 
        
        
    }//GEN-LAST:event_jButtonAgregarProductosActionPerformed

    private void jButton_ConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarVentaActionPerformed
            
            String vta_id=re.generaID();
            String detalle_id="";
            Sales sales= new Sales();            
            Client cl= new Client();
            ArrayList<DetailSales> ld= new ArrayList<>();
            double total=0;  
            
            for (int i = 0; i < jTableDetalle.getRowCount(); i++) {
                System.out.println("dsd"+i);
                r= new Resources();
                DetailSales ds= new DetailSales();
                ds.setDetailsales_id(i+""+r.generaID());
                ds.setDetailsales_cantidad( Double.parseDouble(   jTableDetalle.getValueAt(i, 0).toString()   ));  
                ds.setDetailsales_descripcion(jTableDetalle.getValueAt(i, 1).toString() );                
                ds.setDetailsales_preciounitario(Double.parseDouble(jTableDetalle.getValueAt(i, 2).toString() ));                
                ds.setDetailsales_precioitem(Double.parseDouble( jTableDetalle.getValueAt(i,3).toString() ));
                
                total= total+ds.getDetailsales_precioitem();
                ld.add(ds);
                
            }
            ImplSales is= new ImplSales();
            cl.setPerson_nombres(jTextFieldCodigoCliente.getText());
            sales.setSales_id(vta_id);
            sales.setSales_importetotal(total);
            sales.setSales_client(cl);            
            sales.setSales_tipocomprobante("Boleta");
            sales.setSales_serie("B");
            sales.setListDetailSales(ld);
            sales.setSales_numeroventa(""+is.numeroVta("B"));
            
            
            
            is.registrarSales(sales);
          /*  
            for(DetailSales d :ld){
                System.out.println("ld cargado datos :"+d.getDetailsales_id());
                System.out.println("ld cargado datos :"+d.getDetailsales_cantidad());
                System.out.println(" :"+d.getDetailsales_descripcion());
                System.out.println(" :"+d.getDetailsales_preciounitario());
                System.out.println(" :"+d.getDetailsales_precioitem());
            }   
        System.out.println("total"+total);
        
        */

    }//GEN-LAST:event_jButton_ConfirmarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProductos;
    private javax.swing.JButton jButton_ConfirmarVenta;
    private javax.swing.JComboBox<String> jComboBoxpRODUCTOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCLIENTE;
    private javax.swing.JLabel jLabelCLIENTE1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldPrecioUnitario;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox c) {
        DefaultComboBoxModel combo= new DefaultComboBoxModel();
        c.setModel(combo);
        ImplProducto lc= new ImplProducto();
        try {
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery("select prod_nombre from  producto;");
            while (rs.next()) {  
                Producto con= new Producto();
                con.setProd_nombre(rs.getString(1));
                lc.AddProducto(con);
                combo.addElement(con.getProd_nombre());
                System.out.println("exito");
            }
        } catch (Exception e) {
            System.out.println("erro, no se puede mostrar");
        }
        
    }
}
