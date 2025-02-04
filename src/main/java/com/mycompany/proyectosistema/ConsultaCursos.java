/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectosistema;

import javax.swing.table.DefaultTableModel;
/*import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
*/

/**
 *
 * @author vboxuser
 */
public class ConsultaCursos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCursos
     */
    public ConsultaCursos() {
        initComponents();
        DefaultTableModel data = new DefaultTableModel(new String[]{"Id","Nombre","Sección","Fecha inicio","Fecha fin",
            "Hora inicio","Hora fin","Docente"},ProyectoSistema.curso.size());
        jTable1.setModel(data);
        
        int row=0;
        
        for(Cursoclass e : ProyectoSistema.curso){
            jTable1.setValueAt(e.id, row, 0);
            jTable1.setValueAt(e.nombre, row, 1); 
            jTable1.setValueAt(e.seccion, row, 2); 
            jTable1.setValueAt(e.fechaini, row,3);
            jTable1.setValueAt(e.fechafin, row,4);
            jTable1.setValueAt(e.horaini,row,5);
            jTable1.setValueAt(e.horafin, row,6);
            jTable1.setValueAt(e.profesorasignado, row,7);
            row++;
        }
    }
    
    /*public void leerarchivoJSON(String rutaConNombre){
        JSONParser jp=new JSONParser();
        try{
            FileReader r=new FileReader(rutaConNombre);
            Object obj=jp.parse(r);
            JSONArray cursosList=(JSONArray) obj;
            
            DefaultTableModel tableModel=(DefaultTableModel) jTable1.getModel();
             for(Object c: cursosList){
                 JSONObject CursoclassObj=(JSOObject) c;
                 String id=(String)CursoclassObj.get("id");
                 String nombre=(String)CursoclassObj.get("nombre");
                 String seccion=(String)CursoclassObj.get("seccion");
                 String fechaini=(String)CursoclassObj.get("fechaini");
                 String fechafin=(String)CursoclassObj.get("fechafin");
                 String horaini=(String)CursoclassObj.get("horaini");
                 String horafin=(String)CursoclassObj.get("horafin");
                 String profesorasignado=(String)CursoclassObj.get("profesorasignado");
                 
                 Cursoclass curso=new Cursoclass();
                 curso.id=id;
                 curso.nombre=nombre;
                 curso.fechaini=fechaini;
                 curso.fechafin=fechafin;
                 curso.horaini=horaini;
                 curso.horafin=horafin;
                 
                 ProyectoSistema.add(curso);
                 
                 tableModel.addRoww(new Object[]{id,nombre,seccion,fechaini,fechafin,horaini,horafin,profesorasignado});
             }
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear curso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carga Masiva");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(44, 44, 44)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Administrador admin=new Administrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreacionCurso crear=new CreacionCurso();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        EditarCurso editar=new EditarCurso(jTable1.getSelectedRow());
        editar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
