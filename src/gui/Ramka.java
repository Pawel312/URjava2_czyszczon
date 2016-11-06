/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author student
 */
public class Ramka extends JFrame {

    private SluchaczMenu panel;
    
    public Ramka(String title) {
        
        super(title);

        setLayout(new BorderLayout());

        Pasek paseek = new Pasek();
        
        JTextArea textArea = new JTextArea();
        Dimension size1 = getPreferredSize();
        Dimension size2 = getPreferredSize();
        size1.height = 300;
        textArea.setPreferredSize(size1);
        size2.height=30;
        size2.width=20;
        paseek.setPreferredSize(size2);
        
        panel = new SluchaczMenu();
        panel.addDetailListenr(new DetailListenr(){
            public void detailEventO(DetailEvent event){
                String text = event.getText();
                textArea.append(text);
            }
        });
        Container container = getContentPane();
     
        container.add(panel, BorderLayout.CENTER);
        container.add(textArea,BorderLayout.SOUTH);
       container.add(paseek,BorderLayout.NORTH);

// 
//    frame.add(pasekMenu,BorderLayout.NORTH);
//       frame.add(panel);
       

    }
    

}
