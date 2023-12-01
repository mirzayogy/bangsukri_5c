/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirzayogy.bangsukri_5c.libraries;

/**
 *
 * @author mirza
 */
public class ComboBoxItem {
    int id;
    String item;

    public ComboBoxItem(int id, String item) {
        this.id = id;
        this.item = item;
    }

    @Override
    public String toString() {
        return item;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    
}
