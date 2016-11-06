/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Karol
 */
public class Pasek extends JMenu {

    public Pasek() {

        JMenuBar pasekMenu = new JMenuBar();

        JMenu menuPliku = new JMenu("Plik");
        JMenuItem opcjaPolisa = new JMenuItem("Polisa");
        menuPliku.add(opcjaPolisa);

        menuPliku.addSeparator();

        JMenuItem opcjaDrukuj = new JMenuItem("Drukuj");
        menuPliku.add(opcjaDrukuj);

        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");

          
        menuPliku.add(opcjaZapisz);
        pasekMenu.add(menuPliku);

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LINE_START; 
        gc.gridx = 0;
        gc.gridy = 0;
        add(pasekMenu, gc);
    }
   
}
