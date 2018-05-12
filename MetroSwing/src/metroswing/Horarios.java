/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroswing;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Horario;
import model.Linea;
import model.Parada;

/**
 *
 * @author Cris
 */
public class Horarios extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public HashMap<Parada, ArrayList<Horario>> paradasHorarios;

    public Horarios(ArrayList<Linea> lineas) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        /*for (Window w : Window.getWindows()) {
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(w);
        }*/
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jList2.setVisible(false);
        jList3.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        //jList1.setModel("");
        jList1.setModel(modelListLinea(lineas));

        jList1.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                jScrollPane3.setVisible(false);
                jList3.setVisible(false);

                jLabel5.setVisible(false);

                jLabel4.setVisible(false);

                String obtenido = jList1.getSelectedValue().toString();

                jLabel3.setText("Paradas de la " + obtenido);
                jLabel3.setVisible(true);

                for (Linea object : lineas) {
                    if (object.nombreLinea.equals(obtenido)) {
                        int index = lineas.indexOf(object);
                        System.out.println(lineas.get(index).idaLinea.getHorarioParada());
                        DefaultListModel<String> modelParadas = new DefaultListModel<>();

                        paradasHorarios = lineas.get(index).idaLinea.getHorarioParada();

                        for (Map.Entry<Parada, ArrayList<Horario>> entry : paradasHorarios.entrySet()) {

                            modelParadas.addElement(entry.getKey().nombreParada);

                            String key = entry.getKey().nombreParada;
                            System.out.println(key);
                            for (Horario hora : entry.getValue()) {
                                System.out.println(hora.getHora());
                            }

                            // do stuff
                        }
                        jList2.setModel(modelParadas);
                        jScrollPane2.setVisible(true);
                        jList2.setVisible(true);

                    }
                }
            }

        });
        jList2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                jLabel5.setVisible(false);

                jScrollPane3.setVisible(true);
                jList3.setVisible(true);

                String obtenido = jList2.getSelectedValue().toString();
                System.out.println(obtenido);

                String obtenidolinea = jList1.getSelectedValue().toString();

                jLabel4.setText("Horarios de la parada " + obtenido + " en la " + obtenidolinea);
                jLabel4.setVisible(true);
                DefaultListModel modelHorarios = new DefaultListModel<>();

                for (Map.Entry<Parada, ArrayList<Horario>> entry : paradasHorarios.entrySet()) {

                    if (entry.getKey().nombreParada.equals(obtenido)) {
                        System.out.println("Esta es la que quiero" + entry.getKey().nombreParada);
                        for (Horario hora : paradasHorarios.get(entry.getKey())) {
                            System.out.println("dela parada seleccionada" + hora.getHora());
                            modelHorarios.addElement(hora.getHora());
                        }
                    }
                }

                jList3.setModel(modelHorarios);

            }
        });

        jList3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                Date date = new Date();   // given date
                Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
                calendar.setTime(date);   // assigns calendar to given date 
                int horaactual = calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format

                String obtenido = jList3.getSelectedValue().toString();
                int horametro = Integer.parseInt(obtenido.substring(0, 2));

                if (horaactual < horametro) {

                    int diferencia = horametro - horaactual;
                    jLabel5.setText("El metro pasará en: " + diferencia + " hora(s).");
                    jLabel5.setForeground(Color.decode("#056418"));
                }
                if (horaactual > horametro) {
                    int diferencia = horaactual - horametro;
                    jLabel5.setText("El metro pasó hace: " + diferencia + " hora(s).");
                    jLabel5.setForeground(Color.RED);
                }
                jLabel5.setVisible(true);
            }

        });

    }

    /*
    private DefaultListModel modelListParadas(ArrayList<Parada> paradas) {
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for (Parada object : paradas) {
            model.addElement(object.nombreLinea);
        }
        return model;
    }
     */
    private DefaultListModel modelListLinea(ArrayList<Linea> lineas) {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Linea object : lineas) {
            model.addElement(object.nombreLinea);
        }
        return model;
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
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Linea 1", "Linea 2", "Linea 3", "Linea 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Lineas");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel2.setText("Metro");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Parada 1", "Parada 2", "Parada 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel3.setText("Paradas: Linea 3");

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Horario 1", "Horario 2", "Horario 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel4.setText("Horarios: Parada 2");

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Consulta el horario completo de tu línea y parada favorita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel2)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
