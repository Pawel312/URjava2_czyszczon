/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.EventObject;

/**
 *
 * @author Karol
 */
public class DetailEvent extends EventObject{
    
    private  String text;
    public DetailEvent(Object source, String text) {
        super(source);
        this.text= text;
    }

    public String getText() {
        return text;
    }


}
