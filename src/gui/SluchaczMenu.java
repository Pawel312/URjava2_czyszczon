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
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class SluchaczMenu extends JPanel {

    public SluchaczMenu() {
        JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPliku = new JMenu("Plik");
        JLabel label = new JLabel();
        JLabel label1 = new JLabel("imie: ");
        JLabel label2 = new JLabel("Nazwisko: ");
        JLabel label3 = new JLabel("Marka: ");
        JLabel label4 = new JLabel("Tapicerka");

        JTextField field1 = new JTextField(14);
        JTextField field2 = new JTextField(14);

        String[] sList = new String[]{"Volvo", "BMW"};
        JComboBox<String> seasons = new JComboBox<>(sList);

        ButtonGroup tapicerka = new ButtonGroup();
        JRadioButton[] material = new JRadioButton[2];
        material[0] = new JRadioButton("skorzana");
        material[1] = new JRadioButton("materialowa");
        tapicerka.add((AbstractButton) material[0]);
        tapicerka.add((AbstractButton) material[1]);
        Box b1 = Box.createVerticalBox();

        b1.add(material[0]);
        b1.add(material[1]);
        ActionListener slActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton aButton = (AbstractButton) e.getSource();
                label.setText(aButton.getText());
            }
        };
        material[0].addActionListener(slActionListener);
        material[1].addActionListener(slActionListener);
        
        JCheckBox jCheckBox1 = new JCheckBox("ABS");
          JCheckBox jCheckBox2 = new JCheckBox("Klimatyzacja");
//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        };

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        pasekMenu.add(menuPliku);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx = 0.5;
        gc.weighty = 0.5;
//LABEL1
        gc.gridx = 0;
        gc.gridy = 0;

        add(label1, gc);
//LABEL2
        gc.gridx = 0;
        gc.gridy = 1;

        add(label2, gc);
        //LABEL3       
        gc.gridx = 0;
        gc.gridy = 2;

        add(label3, gc);

        //LABEL4      
        gc.gridx = 0;
        gc.gridy = 3;

        add(label4, gc);
        //checkBox1
         gc.gridx = 0;
        gc.gridy = 4;

        add(jCheckBox1, gc);
        
        //checkBox2
         gc.gridx = 1;
        gc.gridy = 5;

        add(jCheckBox2, gc);
//FIELD1
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 0;
        add(field1, gc);
//FIELD3
        gc.gridx = 1;
        gc.gridy = 1;
        add(field2, gc);
//FIELD3
        gc.gridx = 1;
        gc.gridy = 2;
        add(seasons, gc);
        
        //FIELD4
        gc.gridx = 1;
        gc.gridy = 3;
        add(b1, gc);

//        gc.weighty=10;
//        gc.anchor = GridBagConstraints.FIRST_LINE_START;
//        gc.gridx =1;
//        gc.gridy = 2;
//        add(addButton,gc);
        JMenuItem opcjaPolisa = new JMenuItem("Polisa");
        // opcjaPolisa.addActionListener(new SluchaczMenu());
        menuPliku.add(opcjaPolisa);

        menuPliku.addSeparator();

        JMenuItem opcjaDrukuj = new JMenuItem("Drukuj");
        //  opcjaDrukuj.addActionListener(new SluchaczMenu());
        menuPliku.add(opcjaDrukuj);

        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
        // opcjaZapisz.addActionListener(new SluchaczMenu());
        menuPliku.add(opcjaZapisz);
        gc.gridx = -1;
        gc.gridy = -2;
        add(pasekMenu, gc);

    }

//    public void actionPerformed(ActionEvent e) {
//        String wybrano = e.getActionCommand();
//        if (wybrano.equals("Polisa")) {
//            System.out.println("polisa");
//        } else if (wybrano.equals("Drukuj")) {
//            System.out.println("polisa");
//        } else if (wybrano.equals("Zapisz")) {
//            System.out.println("zapisanoj");}
//            else{
//                    System.exit(0);
//              //ggg
//        }
//    }
}
