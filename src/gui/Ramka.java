/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
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
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label1 = new JLabel();
        JLabel name = new JLabel("Imie");
        name.setDisplayedMnemonic(KeyEvent.VK_0);
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
       frame.add(label1,BorderLayout.CENTER);
         frame.add(name,BorderLayout.SOUTH);
      
        String[] sList=  new String[]{"Ford","Mercedes Benz","Volvo "};
        JComboBox<String> seasons= new JComboBox<>(sList);
        seasons.addItemListener((ItemEvent e)->{
            Object item = e.getItem();
            if(e.getStateChange() == ItemEvent.SELECTED);
            label1.setText(item+" is");
        });
        Container contentPane = frame.getContentPane();
        contentPane.setBounds(100, 40, 40, 40);
     //   contentPane.add(seasons,BorderLayout.CENTER);
//        panel.add(name,BorderLayout.WEST);
//        panel.add(textField,BorderLayout.CENTER);
         frame.setSize(400,400);
    frame.setVisible(true); 
    
//To change body of generated methods, choose Tools | Templates.
    }

    private void menu() {
        JFrame frame = new JFrame("nowa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        
       Container container = frame.getContentPane();
       JMenuBar pasekMenu  = new JMenuBar();
       JMenu menuPliku = new JMenu("Plik");
       JLabel label1 = new JLabel("imie");
       label1.setDisplayedMnemonic(KeyEvent.VK_N);
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
       
       
       JTextField textField  = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
       label1.setLabelFor(textField);
      
       
       container.add(pasekMenu);
       container.add(menuPliku );
       panel.add(label1, BorderLayout.WEST);
       panel.add(textField, BorderLayout.CENTER);
      panel.setBounds(100, 100, 40, 40);
  //  panel.add(label1, BorderLayout.WEST);
    frame.add(pasekMenu,BorderLayout.NORTH);
       frame.add(panel);
   frame.pack();
         frame.setSize(400,400);
    frame.setVisible(true); 
    
    }
}
