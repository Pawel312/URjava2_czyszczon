/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author student
 */
public class SluchaczMenu implements ActionListener{

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

