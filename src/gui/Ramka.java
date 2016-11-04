/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Ramka extends JFrame {

    private SluchaczMenu panel;
    
    public Ramka(String title) {
        
        super(title);

        setLayout(new BorderLayout());

        
        panel = new SluchaczMenu();
        Container container = getContentPane();
        container.add(panel, BorderLayout.WEST);
        
// 
//    frame.add(pasekMenu,BorderLayout.NORTH);
//       frame.add(panel);
       

    }
}
