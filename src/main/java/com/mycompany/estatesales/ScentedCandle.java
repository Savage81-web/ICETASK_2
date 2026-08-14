/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatesales;

/**
 *
 * @author emeris
 */
public class ScentedCandle extends Candle {
    
    private String scent;

    // Getter for scent
    public String getScent() {
        return scent;
    }

    // Setter for scent
    public void setScent(String scent) {
        this.scent = scent;
    }
    
    // Override setHeight
    // Scented candles cost R3.00 per inch
    @Override
    public void setHeight(double height) {
        
        super.setHeight(height);

        // The parent calculates R2.00 per inch.
        // We need R3.00 per inch, so calculate using height.
        // Price has no setter, therefore this method needs
        // another approach.
        
    }
        
}
