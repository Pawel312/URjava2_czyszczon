/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Ramka extends JFrame{

    public Ramka() {
         
    
        
        menu();
      
    }
    
    public static void rama(){
   
 JFrame frame = new JFrame("nowa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel();
       frame.add(label1,BorderLayout.SOUTH);
        
        String[] sList=  new String[]{"Polisa","drukuj","zapisz"};
        JComboBox<String> seasons= new JComboBox<>(sList);
        seasons.addItemListener((ItemEvent e)->{
            Object item = e.getItem();
            if(e.getStateChange() == ItemEvent.SELECTED);
            label1.setText(item+" is");
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(seasons,BorderLayout.NORTH);
         frame.setSize(400,400);
    frame.setVisible(true); 
    
//To change body of generated methods, choose Tools | Templates.
    }

    private void menu() {
        JFrame frame = new JFrame("nowa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JMenuBar pasekMenu  = new JMenuBar();
       JMenu menuPliku = new JMenu("Plik");
       pasekMenu.add(menuPliku);
       
       JMenuItem opcjaPolisa = new JMenuItem("Polisa");
       opcjaPolisa.addActionListener(new SluchaczMenu());
       menuPliku.add(opcjaPolisa);
       
       menuPliku.addSeparator();
       
       JMenuItem opcjaDrukuj = new JMenuItem("Drukuj");
       opcjaDrukuj.addActionListener(new SluchaczMenu());
       menuPliku.add(opcjaDrukuj);
       
       JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
       opcjaZapisz.addActionListener(new SluchaczMenu());
       menuPliku.add(opcjaZapisz);
       frame.add(pasekMenu,BorderLayout.NORTH);
         frame.setSize(400,400);
    frame.setVisible(true); 
    }
}
