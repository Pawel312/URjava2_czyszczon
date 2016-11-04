/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class SluchaczMenu implements ActionListener{
    
    public SluchaczMenu(){
                JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPliku = new JMenu("Plik");
        JLabel label1 = new JLabel("imie");
        JLabel label2 = new JLabel("Nazwisko");
        JLabel label3 = new JLabel("Marka");
        
        
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

        JTextField textField1 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.LEFT);
        JTextField textField2 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.LEFT);
        label1.setLabelFor(textField2);

    }

    public void actionPerformed(ActionEvent e) {
        String wybrano = e.getActionCommand();
        if (wybrano.equals("Polisa")) {
            System.out.println("polisa");
        } else if (wybrano.equals("Drukuj")) {
            System.out.println("polisa");
        } else if (wybrano.equals("Zapisz")) {
            System.out.println("zapisanoj");}
            else{
                    System.exit(0);
              //ggg
        }

    }}

