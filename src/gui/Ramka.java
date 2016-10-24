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

    public Ramka() {

        menu();

    }

    private void menu() {
        JFrame frame = new JFrame("nowa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        // GridBagConstraints gbc = new  GridBagConstraints();
        Container container = frame.getContentPane();
        container.setLayout(null);
        JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPliku = new JMenu("Plik");
        JLabel label1 = new JLabel("imie");
        JLabel label2 = new JLabel("Nazwisko");

        label1.setDisplayedMnemonic(KeyEvent.VK_N);
        label1.setBounds(10, 10, 240, 240);
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

        label1.setBounds(100, 0, 50, 50);
        label2.setBounds(100, 40, 60, 50);
        textField1.setBounds(label1.getBounds().x + 60, label1.getBounds().y + 10, 80, 30);
        textField2.setBounds(label2.getBounds().x + 60, label2.getBounds().y + 10, 80, 30);

        pasekMenu.setBounds(0, 0, 50, 50);
       
        
        container.add(label1);
        container.add(label2);
        container.add(textField1);
        container.add(textField2);

        container.add(pasekMenu);
     //   container.add(menuPliku);
// 
//    frame.add(pasekMenu,BorderLayout.NORTH);
//       frame.add(panel);
        frame.pack();
        frame.setSize(400, 400);
        frame.setVisible(true);

    }
}
