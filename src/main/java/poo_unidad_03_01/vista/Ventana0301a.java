/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_unidad_03_01.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Ventana0301a extends JFrame{

    private List<JPanel> jPanelList;
    
    
    
    public Ventana0301a(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList= new ArrayList<>();
        this.setLayout(new FlowLayout());
        
    }
    
    void iniciarComponentes(){
        var jPanelRojo= new JPanel();
        jPanelRojo.setBackground(Color.red);
        var jPanelAzul= new JPanel();
        jPanelAzul.setBackground(Color.blue);
        var jPanelVerde= new JPanel();
        jPanelVerde.setBackground(Color.green);
        var jPanelNaranja= new JPanel();
        jPanelNaranja.setBackground(Color.orange);
        var jPanelCeleste= new JPanel();
        jPanelCeleste.setBackground(Color.CYAN);
        this.jPanelList.add(jPanelRojo);
        this.jPanelList.add(jPanelAzul);
        this.jPanelList.add(jPanelVerde);
        this.jPanelList.add(jPanelNaranja);
        this.jPanelList.add(jPanelCeleste);
        for(var jPanel: this.jPanelList){
            this.getContentPane().add(jPanel);
        }
        
        
    }
    
    
    
}
