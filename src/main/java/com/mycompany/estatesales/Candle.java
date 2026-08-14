/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatesales;

/**
 *
 * @author emeris
 */
public class Candle {
    
    private String colour;
    private double height;
    private double price;

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    // Price is automatically calculated at R2.00 per inch
    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2.00;
    }

    // Getter for price
    public double getPrice() {
        return price;
        
    }
        
    
}
