package metroswing;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;

/**
 * This sample demonstrates how to load a web page with Google Maps
 * and control it using JxBrowser API.
 */
public class Mapa2 extends javax.swing.JFrame  {
    
    public Mapa2() {
        main(null);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mapa de Metro");
        JPanel panel = new JPanel();
        JLabel jLabel1 = new JLabel("Haga clic en la parada deseada para mostrar su información...");
        jLabel1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        jLabel1.setForeground(Color.DARK_GRAY);
        
        JButton jButton2 = new JButton("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Main().setVisible(true);
                frame.dispose();
            }
        });
        
        /* Creamos el botón para retroceder de ventana
        *  y lo alineamos a la izquierda de la misma.
        */
        panel.setLayout(new BorderLayout());
        panel.add(jButton2, BorderLayout.WEST);
        panel.setBackground(Color.white);
        frame.add(panel,BorderLayout.NORTH);
        
        panel.add(jLabel1, BorderLayout.SOUTH);
        
        System.setProperty("teamdev.license.info", "true");
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.SOUTH);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        String helper = System.getProperty("user.dir");
        
        String url = helper + "\\src\\metroswing\\index.html";
        System.out.println(url);
        browser.loadURL(url);
    }
}